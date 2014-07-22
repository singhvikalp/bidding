package flipkart.rapidfire.auctions.resources;

import com.codahale.metrics.annotation.Timed;
import flipkart.rapidfire.auctions.core.Pong;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by phaneesh.nagaraja on 22/07/14.
 */

@Path("/ping")
@Produces(MediaType.APPLICATION_JSON)
public class PingResource {

    private static final Pong pongResponse = new Pong();

    @GET
    @Timed
    public Pong pong() {
        return pongResponse;
    }
}
