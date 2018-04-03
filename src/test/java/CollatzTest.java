import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzTest {

    @Test
    public void calcCollatz() {
        Collatz col=new Collatz();
        col.calcCollatz(27);
        assertEquals(112,col.count);
    }

    @Test
    public void findQueue() {
        Collatz col=new Collatz();
        col.findQueue(1000000);
        assertEquals(525,col.countMax);
    }
}