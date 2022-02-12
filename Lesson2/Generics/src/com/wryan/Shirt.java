package com.wryan;

public class Shirt {
    private int shirtID = 0;
    private String description = "";
    private String color = "";
    private String size = "";
    private StringBuilder sb = new StringBuilder();

    private Shirt(){}

    public static Shirt newShirt(int id, String description, String color, String size) {
        Shirt newShirt = new Shirt();
        newShirt.setShirtID(id);
        newShirt.setDescription(description);
        newShirt.setColor(color);
        newShirt.setSize(size);
        return newShirt;
    }

    public int getShirtID() {
        return shirtID;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "shirtID=" + getShirtID() +
                ", description='" + getDescription() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                '}';
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setShirtID(int shirtID) {
        this.shirtID = shirtID;
    }
}
