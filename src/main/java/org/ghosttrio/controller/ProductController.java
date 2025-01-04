package org.ghosttrio.controller;

public class ProductController implements Controller3 {
    @Override
    public String handleRequest(String requestUrl) {
        return "request : " + requestUrl;
    }
}
