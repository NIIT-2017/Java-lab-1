import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void main() {
            Sqrt sqrt1 = new Sqrt(7, 0.01);
            assertEquals(2.65, sqrt1.calc(), 0.01);
        }
    }
