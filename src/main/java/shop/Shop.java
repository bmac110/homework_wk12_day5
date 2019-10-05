package shop;

import instrumentComponents.InstrumentComponents;
import instruments.Guitar;
import instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Instrument> instruments;
    private ArrayList<InstrumentComponents> instrumentParts;

    public Shop(){
        this.instruments = new ArrayList<Instrument>();
        this.instrumentParts = new ArrayList<InstrumentComponents>();
    }


    public int instrumentStockCount() {
        return this.instruments.size();
    }

    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }

    public int instrumentPartCount() {
        return instrumentParts.size();
    }

    public void addInstrumentPart(InstrumentComponents instrumentComponents) {
        instrumentParts.add(instrumentComponents);
    }
}
