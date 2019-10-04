package instruments;

public abstract class Instrument {

    private String material;
    private String type;
    private String colour;

    public Instrument(String material, String type, String colour){
        this.material = material;
        this.type = type;
        this.colour = colour;
    }
}
