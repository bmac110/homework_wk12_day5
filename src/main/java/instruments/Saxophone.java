package instruments;

public class Saxophone extends Instrument{

    private String saxophoniness;
    private SaxophoneType saxophoneType;

    public Saxophone(String saxophoniness, SaxophoneType saxophoneType, String material,
                     String type, String colour, int basePrice, int retailPrice, String sound){
        super(material, type, colour, basePrice, retailPrice, sound);
        this.saxophoniness = saxophoniness;
        this.saxophoneType = saxophoneType;
    }

    public String getSaxophoniness() {
        return saxophoniness;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }

    public String play(String sound) {
        return sound;
    }

    public double calculateMarkup() {
        return getRetailPrice() - getBasePrice();
    }
}
