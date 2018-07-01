import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void calc() {
        Sqrt test = new Sqrt (16.0);
        assertEquals(4.0, test.calc(), 0.01);

    }
}