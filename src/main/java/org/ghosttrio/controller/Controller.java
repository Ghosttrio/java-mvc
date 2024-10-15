package org.ghosttrio.controller;

import org.ghosttrio.config.ModelView;

import java.util.Map;

public interface Controller {
    String process(Map<String, Object> paramMap, Map<String, Object> model);
}
