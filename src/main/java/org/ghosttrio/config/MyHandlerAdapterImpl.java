package org.ghosttrio.config;

import org.ghosttrio.controller.Controller2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class MyHandlerAdapterImpl implements MyHandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof Controller2);
    }

    @Override
    public ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        Controller2 controller = (Controller2) handler;
        Map<String, Object> paramMap = createParamMap(request);
        ModelView mv = controller.process(paramMap);
        return mv;
    }

    private Map<String, Object> createParamMap(HttpServletRequest request) {
        Map<String, Object> paramMap = new HashMap<>();
        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> paramMap.put(paramName, request.getParameter(paramName)));
        return paramMap;
    }
}
