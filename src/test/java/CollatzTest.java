import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzTest {

    @Test
    public void collatz() {
        Collatz c = new Collatz();
        assertEquals(1,c.collatz(1));
        assertEquals(90,c.collatz(83522));
        assertEquals(8,c.collatz(20));
        assertEquals(41,c.collatz(431));
        assertEquals(23,c.collatz(81));
    }
}