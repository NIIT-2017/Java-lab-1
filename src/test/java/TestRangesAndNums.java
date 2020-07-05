import static org.junit.Assert.*;

public class TestRangesAndNums {

    @org.junit.Test
    public void RangesToNums() {
        assertEquals("1,2,3,4,5,6,7,10,11,12,13,14,15,16\0", RangesAndNums.RangesToNums("1,2,3-7,10,11-15,16"));
    }

    @org.junit.Test
    public void NumsToRanges() {
        assertEquals("1-4,6,7,10,18\0", RangesAndNums.NumsToRanges("1,2,3,4,6,7,10,18"));
    }
}
