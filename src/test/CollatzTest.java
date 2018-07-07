
import static org.junit.Assert.*;

public class CollatzTest {

    @org.junit.Test
    public void collatz() {
        assertEquals(1, Collatz.collatz(16));
    }

    @org.junit.Test(timeout = 30)
    public void collatzTime() {
        Collatz.collatz(34, 1);
    }

}