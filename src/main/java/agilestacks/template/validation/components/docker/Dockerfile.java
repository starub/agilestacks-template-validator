package agilestacks.template.validation.components.docker;

import agilestacks.template.validation.domain.Part;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Dockerfile extends Part {

    private String from;
    private String user;

}
