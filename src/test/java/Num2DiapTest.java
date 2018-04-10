import org.junit.Test;

import static org.junit.Assert.*;

public class Num2DiapTest {

    @Test
    public void strNum2Diap() {
        String str1 = "1,3,4,5,7,9,10,11,12,14,15";
        assertEquals("1,3-5,7,9-12,14,15",Num2Diap.strNum2Diap(str1));

        String str2 = "1";
        assertEquals("1",Num2Diap.strNum2Diap(str2));
    }
}