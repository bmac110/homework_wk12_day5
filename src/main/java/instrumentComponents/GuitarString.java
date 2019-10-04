package instrumentComponents;

import behaviours.ISell;

public class GuitarString implements ISell {

    private String type;
    private int basePrice;
    private int retailPrice;

    public GuitarString(String type, int basePrice, int retailPrice){
        this.type = type;
        this.basePrice = basePrice;
        this.retailPrice = retailPrice;
    }

    public double calculateMarkup() {
        return retailPrice - basePrice;
    }
}
