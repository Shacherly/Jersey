package com.mufasa;

import org.glassfish.jersey.jetty.JettyHttpContainerFactory;

import java.net.URI;

public class Application {
    public static void main(String[] args) {
        JettyHttpContainerFactory.createServer(URI.create("http://localhost:8080/"), new RestApplication());
    }
}
