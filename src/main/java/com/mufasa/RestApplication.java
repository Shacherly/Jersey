package com.mufasa;

import org.glassfish.jersey.server.ResourceConfig;

public class RestApplication extends ResourceConfig {
    public RestApplication() {
        this.packages("com.mufasa");
    }
}
