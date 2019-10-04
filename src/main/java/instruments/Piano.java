package instruments;

public class Piano extends Instrument{

    private PianoType pianoType;


    public Piano(PianoType pianoType, String material, String type, String colour, int basePrice, int retailPrice, String sound){
        super(material, type, colour, basePrice, retailPrice, sound);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public String play(String sound) {
        return null;
    }

    public double calculateMarkup() {
        return getRetailPrice() - getBasePrice();
    }
}
