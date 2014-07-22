package flipkart.rapidfire.inventory.core;

import java.util.Locale;

/**
 * Created by phaneesh.nagaraja on 22/07/14.
 */
public class Product {

    //private String name;
    private long id;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;
    //private int quality;




    public void setId(long id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }


}
