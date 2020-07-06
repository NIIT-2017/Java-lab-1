//import org.junit.jupiter.api.*; //Maven does not pick up tests version 5
//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;


public class Task1Test {
    @org.junit.Test
    public void checkLineCollatz1() {
        assertEquals(8, Task1.lineCollate(3));
    }

    @org.junit.Test
    public void checkLineCollatz2() {
        assertEquals(262, Task1.lineCollate(6171));
    }

    @org.junit.Test
    public void checkLineCollatz3() {
        assertEquals(351, Task1.lineCollate(77031));
    }


    @org.junit.Test
    public void checkCountMax1() {
        assertEquals(119,Task1.countMax(1,100));
    }

    @org.junit.Test
    public void checkCountMax2() {
        assertEquals(262,Task1.countMax(1,10000));
    }

}