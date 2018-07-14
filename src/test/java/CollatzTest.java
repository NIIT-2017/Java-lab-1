import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzTest {

    @Test
    public void formula() {
        assertEquals(Collatz.formula(10), 7);
    }

    @Test
    public void findBiggestChain() {
        assertEquals(Collatz.findBiggestChain(10), 9);
    }
}