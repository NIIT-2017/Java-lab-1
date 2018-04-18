import org.junit.Test;

import static org.junit.Assert.*;

public class Task1CollatzTest {

    @Test
    public void getCollatz() {
        Collatz Conjecture = new Collatz(1, 100000);
        assertEquals(111, Conjecture.getCollatz(27));
    }

    @Test
    public void getLength() {
        Collatz Conjecture = new Collatz(1, 4);
        assertEquals(7, Conjecture.getLength(1, 4));
    }
}