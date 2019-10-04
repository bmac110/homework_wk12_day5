package instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;
    private GuitarType guitarType;

    public Guitar(int numberOfStrings, GuitarType guitarType, String material, String type, String colour, int price){
        super(material, type, colour, price);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }
}
