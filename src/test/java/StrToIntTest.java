import org.junit.Test;

import static org.junit.Assert.*;

public class StrToIntTest {

    @Test
    public void strToInt() {
        assertArrayEquals(new int[]{1, 2, 3, 5, 6, 7, 8, 10, 12, 13, 14, 15, 16, 17, 18, 21, 30}, StrToInt.StrToInt("1,2,3,5-8,10,12-18,21,30"));
        assertArrayEquals(new int[]{30}, StrToInt.StrToInt("30"));
    }
}