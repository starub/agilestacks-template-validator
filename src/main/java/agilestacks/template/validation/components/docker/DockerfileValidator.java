package agilestacks.template.validation.components.docker;

import io.vavr.collection.CharSeq;
import io.vavr.collection.Seq;
import io.vavr.control.Validation;

public class DockerfileValidator {

    public Validation<Seq<String>, Dockerfile> validate(String from, String user) {
        return Validation
                .combine(
                        validateField("FROM", from),
                        validateField("USER", user))
                .ap(Dockerfile::new);
    }

    private Validation<String, String> validateField(String name, String value) {

        return CharSeq.of(value)
                .transform(seq -> seq.isEmpty()
                        ? Validation.invalid(name + " must not be empty")
                        : Validation.valid(value));
    }
}
