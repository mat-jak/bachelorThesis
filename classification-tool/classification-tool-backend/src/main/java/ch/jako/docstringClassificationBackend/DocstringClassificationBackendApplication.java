package ch.jako.docstringClassificationBackend;

import ch.jako.docstringClassificationBackend.helper.CreaterDocstring;
import ch.jako.docstringClassificationBackend.repositories.docstring.DocstringRepository;
import ch.jako.docstringClassificationBackend.services.docstring.DocstringService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
@EnableCaching
@EnableScheduling
@ComponentScan(basePackages = {"ch.jako.docstringClassificationBackend"})
public class DocstringClassificationBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocstringClassificationBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(DocstringService docstringService, DocstringRepository repository) {
		if(repository.findAll().isEmpty()) {
			return args -> {
				// read json and write to db
				ObjectMapper mapper = new ObjectMapper();
				TypeReference<List<CreaterDocstring>> typeReference = new TypeReference<List<CreaterDocstring>>() {
				};
				InputStream inputStream = TypeReference.class.getResourceAsStream("/json/docstrings.json");
				try {
					List<CreaterDocstring> createrDocstrings = mapper.readValue(inputStream, typeReference);
					for (CreaterDocstring createrDoc : createrDocstrings) {
						docstringService.create(createrDoc);
					}
				} catch (IOException e) {
					System.out.println("Unable to save users: " + e.getMessage());
				}
			};
		}
		else {
			return args -> {

			};
		}
	}

}
