import static org.junit.Assert.assertEquals;

public class L1T1Test {
    @org.junit.Test
    public void chain()
    {
        assertEquals(21, L1T1.chain(19));
        assertEquals(525, L1T1.chain(837799));
    }
}