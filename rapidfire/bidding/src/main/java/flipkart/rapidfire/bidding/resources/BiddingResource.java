package flipkart.rapidfire.bidding.resources;

import flipkart.rapidfire.bidding.core.Bid;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by phaneesh.nagaraja on 22/07/14.
 */
public class BiddingResource {

    @POST
    @Path("/bid")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Bid add(Bid bid) {

        return null;
    }

    @PUT
    @Path("/bid")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Bid update(Bid bid) {

        return null;
    }

    @GET
    @Path("/bid/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Bid get(@PathParam("id") long id) {

        return null;
    }

    @DELETE
    @Path("/bid/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Bid delete(@PathParam("id") long id) {

        return null;
    }

}
