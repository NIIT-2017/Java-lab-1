import org.junit.Test;

import static org.junit.Assert.*;

public class RangeFoldingTest {

    @Test
    public void foldingString() {
        String expected = "1-2,4-7,18-21";
        String expected2 = "1,3,10,18-21";
        assertEquals(expected, RangeFolding.foldingSequence("1,2,4,5,6,7,18,19,20,21"));
        assertEquals(expected2, RangeFolding.foldingSequence("1,3,10,18,19,20,21"));
    }
}