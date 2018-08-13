import org.junit.Test;

import static org.junit.Assert.*;

public class ExpandTest {

    @Test
    public void main() {
        Expand myString = new Expand();
        String line = myString.expand("1,2,4-9,12,13,14-16");
        assertEquals("1,2,4,5,6,7,8,9,12,13,14,15,16", line);
    }
}