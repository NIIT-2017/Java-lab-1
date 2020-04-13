import org.junit.Test;

import static org.junit.Assert.*;

public class Lab1Task2Test {

    @Test
    public void sqrt1() {
        DecimalFormat df1 = new DecimalFormat("#0.00");
        Lab1Task2 task2 = new Lab1Task2();
        String [] args = new String[]{"9.0","0.00000000001"};
        assertEquals("3.00",df1.format(task2.sqrt(args)));
    }
    @Test
    public void sqrt2() {
        DecimalFormat df1 = new DecimalFormat("#0.00");
        Lab1Task2 task2 = new Lab1Task2();
        String [] args = new String[]{"225.0","0.1"};
        assertEquals("15.00",df1.format(task2.sqrt(args)));
    }
}
