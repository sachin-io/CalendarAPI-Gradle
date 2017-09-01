package com.calendar.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by valishah on 2017-08-31.
 */
@Path("/api/v1")
public class SampleEndpoint {

    @GET
    @Path("/greeting")
    public String sampleProcess(){
       return "Welcome.";
   }

}
