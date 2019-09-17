package agilestacks.template.validation.components.docker;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/resources/components/docker")
public class CucumberDockerfileTest {

    @Test
    void dummyTest() {
        //idea test run workaround
    }
}
