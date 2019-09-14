package agilestacks.template.validation.service;

import agilestacks.template.validation.domain.Template;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DefaultTemplateRepository implements TemplateRepository {

    private List<Template> templates = new ArrayList<>();

    @Override
    public List<Template> getAll() {
        return templates;
    }

    @Override
    public void add(Template template) {
        templates.add(template);
    }
}
