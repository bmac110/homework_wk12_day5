package shop;

import behaviours.ISell;
import instrumentComponents.InstrumentComponents;
import instruments.Guitar;
import instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Instrument> instruments;
    private ArrayList<InstrumentComponents> instrumentParts;
    private ArrayList<ISell> stock;


    public Shop(){
        this.instruments = new ArrayList<Instrument>();
        this.instrumentParts = new ArrayList<InstrumentComponents>();
        this.stock = new ArrayList<ISell>();
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

    public void addAllToStock() {
        stock.addAll(instruments);
        stock.addAll(instrumentParts);
    }

    public int getStock(){
        return this.stock.size();
    }

    public void removeItem(ISell stockItem) {
        stock.remove(stockItem);
    }

    public double potentialProfit(){
        double total = 0;
        for(ISell item : stock){
            total += item.calculateMarkup();
        }
        return total;
    }
}
