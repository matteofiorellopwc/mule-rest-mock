package com.pwc.jersey.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;

@Path("/helloworld")
public class HelloWorldResource {

    @GET 
    @Produces("text/plain") 
    @Path("/{name}") 
    public String sayHelloWithUri(@PathParam("name") String name) { 
        return "Hello " + name;
    }
    
    
}