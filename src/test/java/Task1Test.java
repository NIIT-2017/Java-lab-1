import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void seqCollatz() {
        Task1 testseqCollatz = new Task1 ();
        assertEquals(837799, testseqCollatz.seqCollatz ());
    }

    @Test
    void collatz() {
        Task1 testCollatz = new Task1 ();
        assertEquals(8, testCollatz.collatz(3));
    }
}