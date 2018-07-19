import org.junit.Test;

import static org.junit.Assert.*;

public class LenKollatsTest {

    @Test
    public void getKollats() {
        LenKollats koll = new LenKollats(1, 1000000);
        assertEquals(2, koll.getKollats(4));
    }

    @Test
    public void getKollats1() {
        LenKollats koll = new LenKollats(1, 1000000);
        assertEquals(5, koll.getKollats(5));
    }

    @Test
    public void getKollats2() {
        LenKollats koll = new LenKollats(1, 1000000);
        assertEquals(8, koll.getKollats(6));
    }

    @Test
    public void getLen() {
        LenKollats koll = new LenKollats(1, 1000000);
        assertEquals(524, koll.getLen(1,1000000));
    }
}