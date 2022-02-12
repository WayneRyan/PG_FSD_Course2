package client;

import com.wryan.Shirt;
import feature.CacheShirt;
import feature.CacheString;
import generics.feature.CacheAny;

public class TestCacheAny {
    public static void main(String[] args) {
        // Generic
        CacheAny<String> myGenericMessage = new CacheAny<String>();
        CacheAny<Shirt> myGenericShirt = new CacheAny<Shirt>();

        // add data and print
        myGenericMessage.add("save this for me");
        System.out.println("Message is: " + myGenericMessage.get());

        myGenericShirt.add(Shirt.newShirt(1111, "Blue Shirt", "Blue", "Medium"));
        System.out.println("Shirt Type: " + myGenericShirt.get().toString());


    }
}
