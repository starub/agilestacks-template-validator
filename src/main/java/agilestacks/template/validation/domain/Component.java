package agilestacks.template.validation.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Component {

    @Getter
    @Setter
    private List<Part> parts = new ArrayList<>();

}
