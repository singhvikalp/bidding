package flipkart.rapidfire.inventory;

import flipkart.rapidfire.inventory.resources.PingResource;
import flipkart.rapidfire.inventory.resources.ProductResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by phaneesh.nagaraja on 22/07/14.
 */
public class InventoryApplication extends Application<InventoryConfiguration> {

    public static void main(String[] args) throws Exception {
        new InventoryApplication().run(args);
    }

    @Override
    public String getName() {
        return "rapidfire-inventory";
    }

    @Override
    public void initialize(Bootstrap<InventoryConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(InventoryConfiguration configuration,
                    Environment environment) {
        environment.jersey().register(new PingResource());
        environment.jersey().register(new ProductResource());
    }
}
