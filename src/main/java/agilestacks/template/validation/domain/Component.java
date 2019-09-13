package agilestacks.template.validation.domain;

import lombok.Getter;
import lombok.Setter;
import reactor.core.publisher.Flux;

public class Component {

    @Getter
    @Setter
    private Flux<Part> parts;

}
