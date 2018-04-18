import org.junit.Test;

import static org.junit.Assert.*;

public class Task3DiapasonExpandTest {

    @Test
    public void insteadOfDash() {
        Expand testObject = new Expand("5-11", ",", "-");
        assertEquals("6,7,8,9,10", testObject.insteadOfDash(5, 11));
    }

    @Test
    public void exchangeExpand() {
        Expand testObject = new Expand("1,2,4-9,11-12,15", ",", "-");
        assertEquals("1,2,4,5,6,7,8,9,11,12,15", testObject.exchangeExpand());
    }
}