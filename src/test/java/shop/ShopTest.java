package shop;

import instrumentComponents.GuitarString;
import instruments.Guitar;
import instruments.GuitarType;
import instruments.Instrument;
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
}
