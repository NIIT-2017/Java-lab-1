import org.junit.Test;

import static org.junit.Assert.*;

public class To_RollTest {

    @Test
    public void toRoll() {
        To_Roll r = new To_Roll();
        assertEquals("1-5",r.ToRoll("1,2,3,4,5"));
        assertEquals("30-36",r.ToRoll("30,31,32,33,34,35,36"));
        assertEquals("90-94",r.ToRoll("90,91,92,93,94"));
    }
}