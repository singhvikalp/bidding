package flipkart.rapidfire.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Configuration class for the inventory service
 */
public class InventoryConfiguration extends Configuration {

    @NotEmpty
    private int port;

    @JsonProperty
    public int getPort() {
        return port;
    }

    @JsonProperty
    public void setPort(int port) {
        this.port = port;
    }

}
