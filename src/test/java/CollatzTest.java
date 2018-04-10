import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzTest {

    @Test
    public void findLen() {
        assertEquals(112, Collatz.findLen(27));
        assertEquals(21, Collatz.findLen(19));
        assertEquals(1, Collatz.findLen(1));
    }

    @Test
    public void findMaxLen() {
        long[] arr = Collatz.findMaxLen();
        assertEquals(837799,arr[0]);
        assertEquals(525,arr[1]);
    }
}