package lv.starub.agilestacks.template.validation.components.docker;

import io.vavr.collection.CharSeq;
import io.vavr.collection.Seq;
import io.vavr.control.Validation;
import org.springframework.util.StringUtils;

public class DockerfileValidator {

    public Validation<Seq<String>, Dockerfile> mandatory(String from, String user) {
        return Validation
                .combine(
                        validateField("FROM", from),
                        validateField("USER", user),
                        Validation.valid("n/a"),
                        Validation.valid("n/a"))
                .ap(Dockerfile::new);
    }

    public Validation custom(String entryPoint, String cmd) {

        if (StringUtils.isEmpty(entryPoint) && StringUtils.isEmpty(cmd)) {
            return Validation.invalid("ENTRYPOINT or CMD should be specified.");
        }

        return Validation.valid("Dockerfile is valid.");
    }

    private Validation<String, String> validateField(String name, String value) {

        return CharSeq.of(value)
                .transform(seq -> seq.isEmpty()
                        ? Validation.invalid(name + " must not be empty.")
                        : Validation.valid(value));
    }
}
