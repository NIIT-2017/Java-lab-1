  
import static org.junit.Assert.*;

class Task1Test {

    @org.junit.Test
    void seqCollatz() {
        assertEquals(837799, Task1.seqCollatz());
    }

    @org.junit.Test
    void collatz() {
        assertEquals(525, Task1.collatz(837799));
    }
}