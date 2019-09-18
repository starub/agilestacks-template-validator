package lv.starub.agilestacks.template.validation.components.docker;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "src/test/resources/components/docker")
public class CucumberDockerfileTest {

    @Test
    void placeholder() {
        //FIXME: Stanislavs Rubens, idea test configuration workaround
    }
}
