package instrumentComponents;

import behaviours.ISell;

public abstract class InstrumentComponents implements ISell {

    private String type;
    private int basePrice;
    private int retailPrice;

    public InstrumentComponents(String type, int basePrice, int retailPrice){
        this.type = type;
        this.basePrice = basePrice;
        this.retailPrice = retailPrice;
    }

    public String getType() {
        return type;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }
}
