package instrumentComponents;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString("guitar strings", 1, 2);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1, guitarString.calculateMarkup(), 0.01);
    }
}
