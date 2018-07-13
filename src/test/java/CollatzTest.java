import org.junit.Test;

import static org.junit.Assert.*;


public class CollatzTest {
    @Test
    public void collatz() {
        assertEquals(19, Collatz.collatz(9));
    }
}
