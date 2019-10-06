package shop;

import instrumentComponents.GuitarString;
import instruments.Guitar;
import instruments.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    GuitarString guitarStrings;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar(4, GuitarType.BASS,
                "cotton", "Guitar", "purple", 100, 200, "bung");
        guitarStrings = new GuitarString("Guitar strings", 1, 2);
    }

    @Test
    public void canAddInstrumentToArray(){
        shop.addInstrument(guitar);
        assertEquals(1, shop.instrumentStockCount());
    }

    @Test
    public void canAddInstrumentPartToArray(){
        shop.addInstrumentPart(guitarStrings);
        assertEquals(1, shop.instrumentPartCount());
    }

    @Test
    public void canGetAllStock(){
        shop.addInstrument(guitar);
        shop.addInstrumentPart(guitarStrings);
        shop.addAllToStock();
        assertEquals(2, shop.getStock());
    }

    @Test
    public void canRemoveStock(){
        shop.addInstrument(guitar);
        shop.addInstrumentPart(guitarStrings);
        shop.addAllToStock();
        shop.removeItem(guitar);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canGetPotentialProfit(){
        shop.addInstrument(guitar);
        shop.addInstrumentPart(guitarStrings);
        shop.addAllToStock();
        assertEquals(101, shop.potentialProfit(), 0.01);
    }
}
