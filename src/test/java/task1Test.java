import org.junit.Test;
import static org.junit.Assert.*;

public class task1Test {

    @Test
    public void seqCollatz() {
        assertEquals(837799, task1.seqCollatz());
    }

    @Test
    public void collatz() {
        assertEquals(525, task1.collatz(837799));
    }

}