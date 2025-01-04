package org.ghosttrio.controller;

import java.util.HashMap;
import java.util.Map;

public class CustomHandlerMapping {
    private Map<String, Controller3> handlerMap = new HashMap<>();

    public CustomHandlerMapping() {
        handlerMap.put("/user", new UserController());
        handlerMap.put("/product", new UserController());
    }

    public Controller3 getHandler(String requestUrl) {
        return handlerMap.get(requestUrl);
    }
}
