import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void calc() {
        Sqrt obj1 = new Sqrt(3);
        double delta1 = 0.001;
        obj1.setDelta(delta1);
        assertEquals(1.732,obj1.calc(),delta1);

        Sqrt obj2 = new Sqrt(5);
        double delta2 = 0.0001;
        obj2.setDelta(delta2);
        assertEquals(2.2360,obj2.calc(),delta2);
    }
}