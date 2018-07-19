import org.junit.Test;

import static org.junit.Assert.*;

public class razvertkastrTest {

    @Test
    public void diapazon() {
        razvertkastr str = new razvertkastr ("1-8",",","-");
        assertEquals("2,3,4,5,6,7", str.diapazon(1, 8));
    }

    @Test
    public void zamena() {
        razvertkastr str = new razvertkastr ("1-8",",","-");
        assertEquals("1,2,3,4,5,6,7,8", str.zamena());
    }
}