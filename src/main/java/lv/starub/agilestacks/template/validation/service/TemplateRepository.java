package lv.starub.agilestacks.template.validation.service;

import lv.starub.agilestacks.template.validation.domain.Template;

import java.util.List;

public interface TemplateRepository {

    List<Template> getAll();

    void add(Template template);
}
