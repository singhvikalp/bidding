package flipkart.rapidfire.auctions;

import flipkart.rapidfire.auctions.resources.AuctionsResource;
import flipkart.rapidfire.auctions.resources.PingResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by phaneesh.nagaraja on 22/07/14.
 */
public class AuctionsApplication extends Application<AuctionsConfiguration> {

    public static void main(String[] args) throws Exception {
        new AuctionsApplication().run(args);
    }

    @Override
    public String getName() {
        return "rapidfire-auctions";
    }

    @Override
    public void initialize(Bootstrap<AuctionsConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(AuctionsConfiguration configuration,
                    Environment environment) {
        environment.jersey().register(new PingResource());
        environment.jersey().register(new AuctionsResource());
    }
}
