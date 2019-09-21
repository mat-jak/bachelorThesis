package ch.jako.github;

import org.apache.commons.io.FileUtils;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import static java.nio.charset.StandardCharsets.UTF_8;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;


public class GithubAPIService {

    private static class StreamRunner implements Runnable {
        private InputStream inputStream;
        private Consumer<String> consumer;

        public StreamRunner(InputStream inputStream, Consumer<String> consumer) {
            this.inputStream = inputStream;
            this.consumer = consumer;
        }

        @Override
        public void run() {
            new BufferedReader(new InputStreamReader(inputStream)).lines()
                    .forEach(consumer);
        }
    }

    File base = new File("/Users/matej/Desktop/UZH/Bachelorarbeit");
    File githubRepos = new File(base, "githubRepos");
    public List<Item> items = new ArrayList<>();
    public List<String> urls = new ArrayList<>();

    public void run(File urlFile, File destinationRepo, int amount) {
        findUrls(amount, destinationRepo);
        fillFile(urlFile);
    }

    public List<String> findUrls(int amount, File destinationRepo) {

        Client client = ClientBuilder.newClient();

        int rest = amount % 100;

        int iterations = (amount - rest) / 100 + 1;

        for(int i = 0; i < iterations; i++) {
            if( i == 10) {
                try {
                    TimeUnit.MINUTES.sleep(1);
                }
                catch(Exception e) {
                    throw new RuntimeException(e);
                }
            }
            int pageNumber = i + 1;
            String url = "https://api.github.com/search/repositories?q=language:python&&sort=stars&order=desc&per_page=100&page=" + pageNumber;
            if(i+1 == iterations) {
                url = "https://api.github.com/search/repositories?q=language:python&&sort=stars&order=desc&per_page=" + rest + "&page=" + pageNumber;
            }

            WebTarget webTarget = client.target(url);
            Invocation.Builder invocationBuilder = webTarget.request(APPLICATION_JSON).header("Authorization", "be4d9613b38848d9f046e2195b1bf7401d059404");
            Response response = invocationBuilder.get();

            SearchResult res = response.readEntity(SearchResult.class);
            this.items.addAll(res.items);
            System.out.println(this.items.size());
        }


        for (Item item : this.items) {
            System.out.println(item);
            urls.add(item.clone_url);
            cloneGitRepositoryShallow(item, destinationRepo.getAbsolutePath());
        }
        return urls;
    }

    public void fillFile(File f) {
        try {
            FileUtils.writeLines(f,"UTF-8", urls);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean cloneGitRepositoryShallow(Item item, String destinationRepoPath){
        ProcessBuilder builder = new ProcessBuilder();

        System.out.println(String.format("Start Cloning: %s ", item.full_name));
        builder.command("cmd.exe", "/c", String.format("git clone %s %s --depth=1", item.clone_url, item.full_name + File.separator + "blob" + File.separator + item.default_branch));


        File destinationRepo = new File(destinationRepoPath);
        System.out.println(destinationRepoPath);
        if (!destinationRepo.exists()) {
            System.out.println("reached this point");
            return false;
        }

        if (new File(destinationRepo + "\\" + item.full_name).exists()) {
            System.out.println("Repo already downloaded");
            return false;
        }

        builder.directory(destinationRepo);
        try {
            Process process = builder.start();
            StreamRunner streamRunner =
                    new StreamRunner(process.getInputStream(), System.out::println);
            Executors.newSingleThreadExecutor().submit(streamRunner);
            // add timeout
            boolean exitedNormally = process.waitFor(60, TimeUnit.SECONDS);
            process.destroy();
            process.waitFor(10, TimeUnit.SECONDS);
            if (exitedNormally && process.exitValue() == 0){
                System.out.println("Finished cloning");
            }
            else {
                System.out.println("Repository download failed");
                process.destroyForcibly();
                process.waitFor();
            }
            return exitedNormally;
        } catch (Exception ex){
            System.out.println("Clone Repository in Command Line failed");
            return false;
        }


    }
}
