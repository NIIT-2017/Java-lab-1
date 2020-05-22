import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void collatz() {
        assertEquals(525, Task1.collatz(837799));
    }

    @Test
    public void seqCollatz() {
        assertEquals(837799, Task1.seqCollatz());
    }
}