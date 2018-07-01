import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzTest {

    @Test
    public void collatz2() {
        assertEquals(8, Collatz.collatz2(3));
        assertEquals(21, Collatz.collatz2(19));
    }
}