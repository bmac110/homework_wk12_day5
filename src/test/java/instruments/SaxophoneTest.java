package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Very High", SaxophoneType.TENOR
                , "brass", "woodwind", "Gold", 200);
    }

    @Test
    public void hasSaxophoneType(){
        assertEquals(SaxophoneType.TENOR, saxophone.getSaxophoneType());
    }
}
