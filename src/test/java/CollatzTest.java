import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzTest {

    @org.junit.Test
    public void collatz() {
        assertEquals(1, Collatz.collatz(1, 1));
    }

    @org.junit.Test
    public void collatz2() {
        assertEquals(2, Collatz.collatz(2, 1));
    }

    @org.junit.Test
    public void collatz3() {
        assertEquals(8, Collatz.collatz(3, 1));
    }

}