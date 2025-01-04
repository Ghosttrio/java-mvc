package org.ghosttrio.controller;

public class UserController implements Controller3 {
    @Override
    public String handleRequest(String requestUrl) {
        return "request : " + requestUrl;
    }
}
