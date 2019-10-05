package instrumentComponents;

public abstract class InstrumentComponents {

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
