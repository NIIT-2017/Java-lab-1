import org.junit.Test;

import static org.junit.Assert.*;

public class Lab1Task2Test {

    @Test
    public void sqrt1() {
        Lab1Task2 task2 = new Lab1Task2();
        String [] args = new String[]{"9.0","0.00000000001"};
        assertEquals(3.0,task2.sqrt(args));
    }
    @Test
    public void sqrt2() {
        Lab1Task2 task2 = new Lab1Task2();
        String [] args = new String[]{"225.0","0.1"};
        assertEquals(15.000001132796916,task2.sqrt(args));
    }
}
