import static org.junit.Assert.*;

public class KolatcTest {

    @org.junit.Test
    public void collatz() {
        assertEquals(525,Kolatc.collatz(837799));
    }

    @org.junit.Test
    public void maxcollatz() {
        assertEquals(837799,Kolatc.maxcollatz(2,1000000));
    }
}