package instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;
    private GuitarType guitarType;

    public Guitar(int numberOfStrings, GuitarType guitarType, String material,
                  String type, String colour, int basePrice, int retailPrice){
        super(material, type, colour, basePrice, retailPrice);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public String play(String sound) {
        return null;
    }

    public double calculateMarkup() {
        return getRetailPrice() - getBasePrice();
    }
}
