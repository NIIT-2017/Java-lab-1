import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzTest {

//    @Test
//    void nextItem() {
//        assertEquals(10, Collatz.nextItem(3));
//    }

//    @Test
//    void howLongSequence() {
//        assertEquals(8, Collatz.howLongSequence(3));
//    }

    @Test
    void findLongestSequence() {
        Collatz col = new Collatz();
        col.findLongestSequence(1000000);
        assertEquals(525, col.getLongest());
    }
}