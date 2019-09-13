package agilestacks.template.validation.components.docker;


import agilestacks.template.validation.domain.Component;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
class Docker extends Component {

    private Dockerfile dockerfile;

}
