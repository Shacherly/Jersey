package com.mufasa.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;


@Path("/hello")
public class HelloController implements Serializable {

    private static final long serialVersionUID = -467676864314366879L;

    @GET
    @Produces({/*"text/plain;charset=UTF-8"*/MediaType.APPLICATION_JSON})
    public String sayHello() {
        return "圣人之道、吾性自足、不假外求。";
    }

}
