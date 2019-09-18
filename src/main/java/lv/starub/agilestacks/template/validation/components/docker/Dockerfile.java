package lv.starub.agilestacks.template.validation.components.docker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lv.starub.agilestacks.template.validation.domain.Part;

@Getter
@Setter
@AllArgsConstructor
public class Dockerfile extends Part {

    private String from;
    private String user;
    private String entryPoint;
    private String cmd;
}
