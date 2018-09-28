import org.junit.Test;

import static org.junit.Assert.*;

public class task4Test {

    @Test
    public void fold() {
        assertEquals("1,2,4-7,18-21", task4.Fold("1,2,4,5,6,7,18,19,20,21"));
    }
}