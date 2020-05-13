import org.junit.Test;

import static org.junit.Assert.*;

public class Lab1Task1Test {

    @Test
    public void main1() {
        Lab1Task1 task1 = new Lab1Task1();
        String[] args = new String[]{"1","10"};
        assertEquals(9,task1.maxCollatz(args));
    }
    @Test
    public void main2() {
        Lab1Task1 task1 = new Lab1Task1();
        String[] args = new String[]{"1","100"};
        assertEquals(97,task1.maxCollatz(args));
    }
    @Test
    public void main3() {
        Lab1Task1 task1 = new Lab1Task1();
        String[] args = new String[]{"1","1000000"};
        assertEquals(910107,task1.maxCollatz(args));
    }
}
