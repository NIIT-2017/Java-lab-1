import org.junit.Test;

import static org.junit.Assert.*;

public class Lab1Task4Test {

    @Test
    public void stringNumbersToStringRanges1() {
        Lab1Task4 task4 = new Lab1Task4();
        assertEquals("1",task4.stringNumbersToStringRanges("1"));
    }
    @Test
    public void stringNumbersToStringRanges2() {
        Lab1Task4 task4 = new Lab1Task4();
        assertEquals("1-3,5",task4.stringNumbersToStringRanges("1,2,3,5"));
    }
    @Test
    public void stringNumbersToStringRanges3() {
        Lab1Task4 task4 = new Lab1Task4();
        assertEquals("1-3,5,10-12",task4.stringNumbersToStringRanges("1,2,3,5,10,11,12"));
    }
    @Test
    public void stringNumbersToStringRanges4() {
        Lab1Task4 task4 = new Lab1Task4();
        assertEquals("1-3,5,10-12,100",task4.stringNumbersToStringRanges("1,2,3,5,10,11,12,100"));
    }
}
