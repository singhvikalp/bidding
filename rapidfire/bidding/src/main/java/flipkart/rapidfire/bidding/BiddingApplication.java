package flipkart.rapidfire.bidding;

import flipkart.rapidfire.bidding.resources.BiddingResource;
import flipkart.rapidfire.bidding.resources.PingResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by phaneesh.nagaraja on 22/07/14.
 */
public class BiddingApplication  extends Application<BiddingConfiguration> {

    public static void main(String[] args) throws Exception {
        new BiddingApplication().run(args);
    }

    @Override
    public String getName() {
        return "rapidfire-bidding";
    }

    @Override
    public void initialize(Bootstrap<BiddingConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(BiddingConfiguration configuration,
                    Environment environment) {
        environment.jersey().register(new PingResource());
        environment.jersey().register(new BiddingResource());
    }
}
