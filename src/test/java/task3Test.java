import org.junit.Test;

import static org.junit.Assert.*;

public class task3Test {

    @Test
    public void sequence() {
        assertEquals("3,56,57,58,59,60,12,2,3,12,13,14,15", task3.sequence("3,56-60,12,2,3,12-15"));
        assertEquals("-1,0,1,89,5,6,7", task3.sequence("-1-1,89,5-7"));
        assertEquals("-4,-3,-2,-1,0,1,2,3,4,5", task3.sequence("-4--1,0,1,2,3,4,5"));
        assertEquals("5,6,2,1,0,-1,-2,7,8", task3.sequence("5,6,2--2,7,8"));
    }
}