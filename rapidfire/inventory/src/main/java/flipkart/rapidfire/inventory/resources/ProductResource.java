package flipkart.rapidfire.inventory.resources;

import flipkart.rapidfire.inventory.core.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by phaneesh.nagaraja on 22/07/14.
 */
public class ProductResource {

    private Map<Long, Product> productMap;



    @POST
    @Path("/product")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Product add(Product product) {
        if(productMap==null)
            productMap=new HashMap<Long, Product>();
        Long id=new Long(product.getId());
        if(productMap.get(id)!=null)
        {
           //error
            return null;
        }
        productMap.put(id,product);
        return product;
    }

    @PUT
    @Path("/product")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Product update(Product product) {
        if(productMap==null)
            return null;
        Long id=new Long(product.getId());
        if(productMap.get(id)==null)
            return null;
        productMap.remove(id);
        productMap.put(id,product);

        return product;
    }

    @GET
    @Path("/product/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product get(@PathParam("id") long id) {

        if(productMap==null)
            return null;
        if(productMap.get(id)==null)
            return null;
        return  productMap.get(id);

    }


    @DELETE
    @Path("/product/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product delete(@PathParam("id") long id) {

        if(productMap==null)
            return null;
        if(productMap.get(id)==null)
            return null;
        Product product =productMap.get(id);
        productMap.remove(id);

        return product;
    }


    @POST
    @Path("/product/inventory/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product inventoryIncrement(@PathParam("id") long id) {

        if(productMap==null)
            return null;
        if(productMap.get(id)==null)
            return null;
        Product product =productMap.get(id);
        int count=product.getCount();
        product.setCount(count+1);

        return product;
    }

    @DELETE
    @Path("/product/inventory/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product inventoryDecrement(@PathParam("id") long id) {
        if(productMap==null)
            return null;
        if(productMap.get(id)==null)
            return null;
        Product product =productMap.get(id);
        int count=product.getCount();
        if(count==1)
        {
            this.delete(id);
            return product;
        }
        product.setCount(count-1);
        return product;

    }

}
