package lv.starub.agilestacks.template.validation.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Template {

    private List<Stack> stacks = new ArrayList<>();

}
