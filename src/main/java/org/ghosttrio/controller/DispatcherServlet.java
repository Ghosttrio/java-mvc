package org.ghosttrio.controller;

public class DispatcherServlet {
    private CustomHandlerAdapter handlerAdapter;
    private CustomHandlerMapping handlerMapping;

    public DispatcherServlet() {
        handlerMapping = new CustomHandlerMapping();
        handlerAdapter = new CustomHandlerAdapter();
    }

    public String service(String requestUrl) {
        Controller3 controller = handlerMapping.getHandler(requestUrl);

        if (controller != null) {
            return handlerAdapter.handleRequest(controller, requestUrl);
        } else {
            return "404 error";
        }
    }
}
