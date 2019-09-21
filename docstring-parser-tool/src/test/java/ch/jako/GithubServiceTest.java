package ch.jako;

import ch.jako.github.GithubAPIService;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

public class GithubServiceTest {

    final File urlList = new File("/Users/matej/Desktop/UZH/Bachelorarbeit/testcases/urls");
    final File repo = new File("/Users/matej/Desktop/UZH/Bachelorarbeit/testcases/githubServiceTest");
    final File newRepo = new File("/Users/matej/Desktop/UZH/Bachelorarbeit/testcases/extractorTestDocstrings");

    @Test
    public void urlTest() {

        new GithubAPIService().run(urlList, repo,2);
        try {
            String urls = FileUtils.readFileToString(urlList, UTF_8);
            Assert.assertTrue(urls.contains(".git"));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
