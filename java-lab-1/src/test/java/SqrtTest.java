import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void calc() {
        assertEquals(2.8, new Sqrt(8, 1.0).calc(), 1.0);
    }
}