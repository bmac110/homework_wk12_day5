package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(PianoType.GRAND, "concrete",
                "Piano", "black", 200, 400);
    }

    @Test
    public void hasPianoType(){
        assertEquals(PianoType.GRAND, piano.getPianoType());
    }

    @Test
    public void hasMarkupPrice(){
        assertEquals(200, piano.calculateMarkup(), 0.01);
    }
}
