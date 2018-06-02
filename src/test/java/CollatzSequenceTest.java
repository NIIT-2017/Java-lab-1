import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzSequenceTest {

    @Test(timeout = 50)
    public void collatzNum() {
        assertEquals(112, CollatzSequence.collatzNum(27));
        assertEquals(21, CollatzSequence.collatzNum(19));
    }
}