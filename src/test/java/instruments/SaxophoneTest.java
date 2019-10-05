package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Very High", SaxophoneType.TENOR
                , "brass", "woodwind", "Gold", 100, 200, "phwee");
    }

    @Test
    public void hasSaxophoneType(){
        assertEquals(SaxophoneType.TENOR, saxophone.getSaxophoneType());
    }

    @Test
    public void hasMarkupPrice(){
        assertEquals(100, saxophone.calculateMarkup(), 0.01);
    }

    @Test
    public void canMakeSound(){
        assertEquals("phwee", saxophone.play("phwee"));
    }
}
