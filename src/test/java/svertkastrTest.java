import org.junit.Test;

import static org.junit.Assert.*;

public class svertkastrTest {

    @Test
    public void diapazonsv() {
        svertkastr str = new svertkastr ("1,2,3,4,5,6,7,8",",","-");
        assertEquals("1-8",str.diapazonsv());
    }
}