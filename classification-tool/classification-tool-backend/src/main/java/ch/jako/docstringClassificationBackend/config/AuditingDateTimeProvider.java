package ch.jako.docstringClassificationBackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.OffsetDateTime;
import java.util.Optional;

@Configuration
@EnableJpaAuditing(dateTimeProviderRef = "jpaAuditingDateTimeProvider")
public class AuditingDateTimeProvider {

    @Bean(name = "jpaAuditingDateTimeProvider")
    public DateTimeProvider jpaAuditingDateTimeProvider() {
        return () -> Optional.of(OffsetDateTime.now());
    }
}
