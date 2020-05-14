import org.junit.Test;

import static org.junit.Assert.*;

public class task4Test {

    @Test
    public void convolution() {
        assertEquals("5,4,1-4,8,5,43-46", task4.convolution("5,4,1,2,3,4,8,5,43,44,45,46"));
        assertEquals("1,4-7,-15--12,7", task4.convolution("1,4,5,6,7,-15,-14,-13,-12,7"));
        assertEquals("-3,2,-1-1,-2,3", task4.convolution("-3,2,-1,0,1,-2,3"));
        assertEquals("-3-3", task4.convolution("-3,-2,-1,0,1,2,3"));
    }
}