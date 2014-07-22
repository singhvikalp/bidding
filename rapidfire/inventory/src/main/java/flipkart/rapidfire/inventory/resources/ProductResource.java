package flipkart.rapidfire.inventory.resources;

import flipkart.rapidfire.inventory.core.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by phaneesh.nagaraja on 22/07/14.
 */
public class ProductResource {

    @POST
    @Path("/product")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Product add(Product product) {

        return null;
    }

    @PUT
    @Path("/product")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Product update(Product product) {

        return null;
    }

    @GET
    @Path("/product/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product get(@PathParam("id") long id) {

        return null;
    }

    @DELETE
    @Path("/product/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product delete(@PathParam("id") long id) {

        return null;
    }

    @POST
    @Path("/product/inventory/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product inventoryIncrement(@PathParam("id") long id) {

        return null;
    }

    @DELETE
    @Path("/product/inventory/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product inventoryDecrement(@PathParam("id") long id) {

        return null;
    }

}
