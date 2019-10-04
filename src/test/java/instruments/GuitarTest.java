package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(4, GuitarType.BASS, "concrete",
                "Guitar", "black", 115, 200);
    }

    @Test
    public void hasStrings(){
        assertEquals(4, guitar.getNumberOfStrings());
    }

    @Test
    public void hasGuitarType(){
        assertEquals(GuitarType.BASS, guitar.getGuitarType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("concrete", guitar.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals("Guitar", guitar.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void hasMarkupPrice(){
        assertEquals(85, guitar.calculateMarkup(), 0.01);
    }
}
