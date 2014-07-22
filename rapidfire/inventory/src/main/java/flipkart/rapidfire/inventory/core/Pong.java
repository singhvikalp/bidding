package flipkart.rapidfire.inventory.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by phaneesh.nagaraja on 22/07/14.
 */
public class Pong {



    private String pong = "Pong";

    public Pong() {

    }

    @JsonProperty
    public String getPong() {
        return pong;
    }

    @JsonProperty
    public void setPong(String pong) {
        this.pong = pong;
    }
}
