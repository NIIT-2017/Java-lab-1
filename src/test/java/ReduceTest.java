import org.junit.Test;

import static org.junit.Assert.*;

public class ReduceTest {

    @Test
    public void main() {
        Reduce myString = new Reduce();
        String line = myString.reduce("1,2,4,5,6,7,18,19,20,21");
        assertEquals("1,2,4-7,18-21", line);
    }
}