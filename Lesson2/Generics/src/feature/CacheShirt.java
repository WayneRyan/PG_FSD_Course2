package feature;

import com.wryan.Shirt;

public class CacheShirt {

    private Shirt shirt;

    public void add (Shirt shirt) {
        this.shirt = shirt;
    }

    public Shirt get() {
        return this.shirt;
    }
}
