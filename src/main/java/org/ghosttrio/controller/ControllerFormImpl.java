package org.ghosttrio.controller;

import org.ghosttrio.config.ModelView;
import org.ghosttrio.config.MyView;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class ControllerFormImpl implements Controller {
    @Override
    public String process(Map<String, Object> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}
