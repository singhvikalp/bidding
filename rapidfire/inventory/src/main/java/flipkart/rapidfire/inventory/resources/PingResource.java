package flipkart.rapidfire.inventory.resources;

import com.codahale.metrics.annotation.Timed;
import flipkart.rapidfire.inventory.core.Pong;
import org.slf4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.spi.http.HttpContext;

/**
 * Created by phaneesh.nagaraja on 22/07/14.
 */

@Path("/ping")
@Produces(MediaType.APPLICATION_JSON)
public class PingResource {

    private static final Pong pongResponse = new Pong();

    private static Logger logger = org.slf4j.LoggerFactory.getLogger(PingResource.class);

    @GET
    @Timed
    public Pong pong(@Context HttpContext context) throws Exception {
        if(System.currentTimeMillis() % 15 == 0) {
            logger.error("Error sending pong response");
            throw new Exception("Oops! Something went wrong");
        }
        return pongResponse;
    }
}
