package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String type;
    private String colour;
    private int basePrice;
    private int retailPrice;

    public Instrument(String material, String type, String colour, int basePrice, int retailPrice){
        this.material = material;
        this.type = type;
        this.colour = colour;
        this.basePrice = basePrice;
        this.retailPrice = retailPrice;
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

    public int getBasePrice() {
        return basePrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }
}
