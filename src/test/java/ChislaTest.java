import org.junit.Test;

import static org.junit.Assert.*;

public class ChislaTest {

    @Test
    public void parseString() {
        assertEquals("1,2,4-7,18-21","1,2,4,5,6,7,18,19,20,21",Chisla.parseString("1,2,4-7,18-21"));

        assertEquals("1-5,8,21,9,35-37,39","1,2,3,4,5,8,21,9,35,36,37,39",Chisla.parseString("1-5,8,21,9,35-37,39"));
    }
}