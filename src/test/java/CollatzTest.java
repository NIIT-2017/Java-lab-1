import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzTest {

    @Test
    public void sequenceLength() {
        Collatz myCollatz = new Collatz();
        myCollatz.sequenceLength(54);
        assertEquals(113, myCollatz.seqLength);

    }

    @Test
    public void sequenceCalculation() {
        Collatz myCollatz = new Collatz();
        myCollatz.sequenceCalculation(1000000);
        assertEquals(525, myCollatz.maxSeqLength);

    }
}