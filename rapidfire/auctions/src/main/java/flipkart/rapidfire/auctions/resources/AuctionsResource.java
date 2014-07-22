package flipkart.rapidfire.auctions.resources;

import flipkart.rapidfire.auctions.core.Auction;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by phaneesh.nagaraja on 22/07/14.
 */
public class AuctionsResource {

    @POST
    @Path("/auction")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Auction add(Auction product) {

        return null;
    }

    @PUT
    @Path("/auction")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Auction update(Auction product) {

        return null;
    }

    @GET
    @Path("/auction/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Auction get(@PathParam("id") long id) {

        return null;
    }

    @DELETE
    @Path("/auction/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Auction delete(@PathParam("id") long id) {

        return null;
    }

    @POST
    @Path("/auction/start/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Auction start(@PathParam("id") long id) {

        return null;
    }

    @POST
    @Path("/auction/stop/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Auction end(@PathParam("id") long id) {

        return null;
    }

}
