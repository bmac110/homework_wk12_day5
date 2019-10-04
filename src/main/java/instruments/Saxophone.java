package instruments;

public class Saxophone extends Instrument{

    private String saxophoniness;
    private SaxophoneType saxophoneType;

    public Saxophone(String saxophoniness, SaxophoneType saxophoneType, String material, String type, String colour, int price){
        super(material, type, colour, price);
        this.saxophoniness = saxophoniness;
        this.saxophoneType = saxophoneType;
    }

    public String getSaxophoniness() {
        return saxophoniness;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }
}
