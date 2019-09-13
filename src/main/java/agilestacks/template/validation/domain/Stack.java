package agilestacks.template.validation.domain;

import lombok.Getter;
import lombok.Setter;
import reactor.core.publisher.Flux;

@Getter
@Setter
class Stack {

    private Flux<Component> components;

}
