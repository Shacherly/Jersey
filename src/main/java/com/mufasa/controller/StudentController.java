package com.mufasa.controller;


import com.mufasa.domain.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.util.ArrayList;
import java.util.List;

@Path("/sys")
public class StudentController {

    @GET
    @Path("/stu")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Student> list() {
        List<Student> list = new ArrayList<>(10);
        Student s1 = new Student(1L, "s1");
        Student s2 = new Student(2L, "s2");
        list.add(s1);
        list.add(s2);
        System.out.println(list);
        return list;
    }

    @POST
    @Path("/stu")
    @Produces({MediaType.APPLICATION_JSON/*, MediaType.APPLICATION_XML*/})
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED, MediaType.APPLICATION_XML})
    public Student save(@FormParam("name") String name) {
        System.out.println(name);
        Student student = new Student();
        student.setName(name);

        return student;
    }

    @GET
    @Path("/all")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        System.err.println("====================");
        return Response.ok(new Student()).build();
    }
}
