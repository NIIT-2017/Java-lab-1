import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSequenceOfCollatzTest {

    @Test
    public void collatz() {
        assertEquals(525, MaxSequenceOfCollatz.collatz(837799));
    }
    @Test
    public void maxSequence() {
        assertEquals(837799, MaxSequenceOfCollatz.MaxSequence());
    }
}