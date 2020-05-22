import org.junit.Test;

import static org.junit.Assert.*;

public class task1Test {

    @Test
    public void collatz() {
        assertEquals(1, task1.collatz(1));
        assertEquals(525, task1.collatz(837799));
        assertEquals(21, task1.collatz(19));
        assertEquals(112, task1.collatz(27));
        assertEquals(179, task1.collatz(871));
    }

    @Test
    public void maxCollatz() {
        assertEquals(837799, task1.maxCollatz(1,1000000));
    }
}