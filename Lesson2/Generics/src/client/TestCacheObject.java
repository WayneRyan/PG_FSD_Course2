package client;

import com.wryan.Shirt;
import feature.CacheShirt;
import feature.CacheString;

public class TestCacheObject {
    public static void main(String[] args) {
        CacheString myMessage = new CacheString(); // type specific
        CacheShirt myShirt = new CacheShirt(); // type specific

        myMessage.add("save this for me");
        System.out.println("Message is: " + myMessage.get());

        myShirt.add(Shirt.newShirt(1111, "Blue Shirt", "Blue", "Medium"));
        System.out.println("Shirt Type: " + myShirt.get().toString());


    }
}
