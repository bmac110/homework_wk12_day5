package instruments;

public class Piano extends Instrument{

    private PianoType pianoType;


    public Piano(PianoType pianoType, String material, String type, String colour, int price){
        super(material, type, colour, price);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }
}
