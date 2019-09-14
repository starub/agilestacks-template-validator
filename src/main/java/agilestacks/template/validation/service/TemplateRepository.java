package agilestacks.template.validation.service;

import agilestacks.template.validation.domain.Template;

import java.util.List;

public interface TemplateRepository {

    List<Template> getAll();

    void add(Template template);
}
