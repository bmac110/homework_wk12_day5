package instrumentComponents;

import behaviours.ISell;

public class GuitarString extends InstrumentComponents {


    public GuitarString(String type, int basePrice, int retailPrice){
        super(type, basePrice, retailPrice);
    }

    public double calculateMarkup() {
        return getRetailPrice() - getBasePrice();
    }
}
