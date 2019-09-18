package lv.starub.agilestacks.template.validation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@org.springframework.context.annotation.Configuration
@EnableSwagger2
public class Configuration {

    @Bean
    Docket swaggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("lv.starub.agilestacks.template.validation"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfo(
                        "Agilestack template validator",
                        "Service for validation of AgileStacks components",
                        "1.0",
                        "",
                        new Contact("Stanislavs Rubens", "", "starub@gmail.com"),
                        "",
                        "",
                        Collections.emptyList()
                ));
    }

    @Bean
    ObjectMapper mapperConfiguration() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        return mapper;
    }
}
