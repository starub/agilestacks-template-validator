package agilestacks.template.validation.components.docker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.vavr.collection.Seq;
import io.vavr.control.Validation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DockerfileStepDefs {

    private Dockerfile dockerfile;
    private Validation<Seq<String>, Dockerfile> mandatoryValidation;

    @Given("Dockerfile with empty FROM field")
    public void parsedDockerfile() {
        dockerfile = new Dockerfile("", "root");
    }

    @When("Validating field FROM")
    public void validatingFromField() {
        DockerfileValidator validator = new DockerfileValidator();
        mandatoryValidation = validator.validate(dockerfile.getFrom(), dockerfile.getUser());
    }

    @Then("Mandatory validation should fail")
    public void validationShouldFail() {
        assertTrue(mandatoryValidation.isInvalid());
        assertEquals("FROM must not be empty", mandatoryValidation.getError().get(0));
    }
}
