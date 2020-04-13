import org.junit.Test;

import static org.junit.Assert.*;

public class Lab1Task3Test {

    @Test
    public void stringRangesToStringNumbers1() {
        Lab1Task3 task3 = new Lab1Task3();
        assertEquals("1", task3.stringRangesToStringNumbers("1"));;
    }
    @Test
    public void stringRangesToStringNumbers2() {
        Lab1Task3 task3 = new Lab1Task3();
        assertEquals("1, 2, 3", task3.stringRangesToStringNumbers("1-3"));;
    }
    @Test
    public void stringRangesToStringNumbers3() {
        Lab1Task3 task3 = new Lab1Task3();
        assertEquals("1, 2, 3, 5, 6, 7", task3.stringRangesToStringNumbers("1-3,5-7"));;
    }
    @Test
    public void stringRangesToStringNumbers4() {
        Lab1Task3 task3 = new Lab1Task3();
        assertEquals("1, 2, 3, 5, 7, 8, 9", task3.stringRangesToStringNumbers("1-3,5,7-9"));;
    }
    @Test
    public void stringRangesToStringNumbers5() {
        Lab1Task3 task3 = new Lab1Task3();
        assertEquals("1, 2, 3, 5, 7, 8, 9, 11", task3.stringRangesToStringNumbers("1-3,5,7-9,11"));;
    }
}
