package org.ghosttrio.controller;

public class Main {
    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();

        System.out.println(dispatcherServlet.service("/user"));
        System.out.println(dispatcherServlet.service("/product"));
        System.out.println(dispatcherServlet.service("/unknown"));
    }
}
