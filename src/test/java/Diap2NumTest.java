import org.junit.Test;

import static org.junit.Assert.*;

public class Diap2NumTest {

    @Test
    public void strDiap2Num() {
        String str1 = "1-3,7,9,11,13-15";
        assertEquals("1,2,3,7,9,11,13,14,15",Diap2Num.strDiap2Num(str1));

        String str2 = "1";
        assertEquals("1",Diap2Num.strDiap2Num(str2));
    }
}