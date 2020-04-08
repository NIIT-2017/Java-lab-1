  
import static org.junit.Assert.*;

class Task1Test {

    @org.junit.Test
    public void seqCollatz() {
        assertEquals(837799, Task1.seqCollatz());
    }

    @org.junit.Test
    public void collatz() {
        assertEquals(525, Task1.collatz(837799));
    }
}