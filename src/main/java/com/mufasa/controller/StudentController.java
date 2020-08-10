package com.mufasa.controller;


import com.mufasa.domain.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/sys")
public class StudentController {

    @GET
    @Path("/stu")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Student> list() {
        List<Student> list = new ArrayList<>(10);
        Student s1 = new Student(1L, "s1");
        Student s2 = new Student(2L, "s2");
        list.add(s1);
        list.add(s2);
        return list;
    }

    @POST
    @Path("/stu")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public void save(@FormParam("name") String name) {
        System.out.println(name);
    }
}
