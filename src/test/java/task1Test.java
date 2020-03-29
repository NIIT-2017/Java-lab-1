import org.junit.Assert;
import static org.junit.Assert.*;

public class task1Test {
    @org.junit.Test
    public void seqCollatz() {
        Assert.assertEquals(837799, task1.seqCollatz());
        Assert.assertEquals(525, task1.collatz(837799));
    }
}