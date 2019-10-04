package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument {

    private String material;
    private String type;
    private String colour;
    private int price;

    public Instrument(String material, String type, String colour, int price){
        this.material = material;
        this.type = type;
        this.colour = colour;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }
}
