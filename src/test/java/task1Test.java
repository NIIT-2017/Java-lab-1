import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task1Test {

    @Test
    void seqCollatz() {
        assertEquals(837799, task1.seqCollatz());
    }

    @Test
    void collatz() {
        assertEquals(525, task1.collatz(837799));
    }

}