import org.junit.Test;

import static org.junit.Assert.*;

public class NumOutTest {

    @Test
    public void deployment() {
        NumOut n = new NumOut();
        assertEquals("1,2,3", n.Deployment("1-3"));
        assertEquals("4,5,6,7,8", n.Deployment("4-8"));
        assertEquals("1,2,3,4,5,7,8,9,10,11,12,18,19,20,21", n.Deployment("1-5,7-12,18-21"));
    }
}