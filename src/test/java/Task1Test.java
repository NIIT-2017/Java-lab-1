import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void collatz() {
        assertEquals(1, Task1.collatz(1));
        assertEquals(21, Task1.collatz(19));
        assertEquals(525, Task1.collatz(837799));
    }

    @Test
    public void sqCollatz() {
        assertEquals(837799, Task1.sqCollatz());
    }
}