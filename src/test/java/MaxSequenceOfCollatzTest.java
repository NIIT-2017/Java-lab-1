import org.junit.Test;

import static org.junit.Assert.*;

class MaxSequenceOfCollatzTest {

    @Test
    void collatz() {
        assertEquals(525, MaxSequenceOfCollatz.collatz(837799));
    }
    @Test
    void maxSequence() {
        assertEquals(837799, MaxSequenceOfCollatz.MaxSequence());
    }
}