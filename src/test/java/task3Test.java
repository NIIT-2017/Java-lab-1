import org.junit.Test;

import static org.junit.Assert.*;

public class task3Test {

    @Test
    public void unfold() {
        assertEquals("1,2,4,5,6,7,18,19,20,21", task3.Unfold("1,2,4-7,18-21"));
    }
}