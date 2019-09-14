package agilestacks.template.validation.webapi;

import agilestacks.template.validation.domain.Template;
import agilestacks.template.validation.service.TemplateRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/templates")
@Api(description = "Set of endpoints for template management")
class APIController {

    private final TemplateRepository templateRepository;

    @GetMapping
    @ApiOperation("Returns all templates")
    ResponseEntity<List<Template>> getAll() {
        return new ResponseEntity<List<Template>>(templateRepository.getAll(), HttpStatus.OK);
    }

    @PostMapping("/new")
    @ApiOperation("create new Template")
    public ResponseEntity<Template> add() {
        Template template = new Template();
        templateRepository.add(template);
        return new ResponseEntity<>(template,HttpStatus.OK);
    }
}
