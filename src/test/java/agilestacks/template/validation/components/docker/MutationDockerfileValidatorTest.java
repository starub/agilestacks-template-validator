package agilestacks.template.validation.components.docker;


import io.vavr.collection.Seq;
import io.vavr.control.Validation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MutationDockerfileValidatorTest {

    @Test
    void mandatoryValidationValid() {
        Dockerfile file = new Dockerfile("TEST","USER","ENTRYPOINT","CMD");
        DockerfileValidator validator = new DockerfileValidator();
        Validation<Seq<String>, Dockerfile> validation = validator.mandatoryValidation(file.getFrom(), file.getUser());
        assertTrue(validation.isValid());
    }

    @Test
    void mandatoryValidationInvalid() {
        Dockerfile file = new Dockerfile("FROM","","ENTRYPOINT","CMD");
        DockerfileValidator validator = new DockerfileValidator();
        Validation<Seq<String>, Dockerfile> validation = validator.mandatoryValidation(file.getFrom(), file.getUser());
        assertTrue(validation.isInvalid());
    }

    @Test
    void customValidationValid() {
        Dockerfile file = new Dockerfile("FROM","USER","ENTRYPOINT","CMD");
        DockerfileValidator validator = new DockerfileValidator();
        Validation validation = validator.customValidation(file.getEntryPoint(),file.getCmd());
        assertTrue(validation.isValid());

    }

    //FIXME: Stanislavs Rubens, uncomment for passing mutation check

//    @Test
//    void customValidationInvalid() {
//        Dockerfile file = new Dockerfile("FROM","USER","","");
//        DockerfileValidator validator = new DockerfileValidator();
//        Validation<Seq<String>, Dockerfile> validation = validator.customValidation(file.getEntryPoint(),file.getCmd());
//        assertTrue(validation.isInvalid());
//
//    }

}