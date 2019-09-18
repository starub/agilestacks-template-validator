package lv.starub.agilestacks.template.validation.components.docker;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lv.starub.agilestacks.template.validation.domain.Component;

@Builder
@Getter
@Setter
class Docker extends Component {

    private Dockerfile dockerfile;

}
