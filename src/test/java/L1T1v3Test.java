import static org.junit.Assert.*;
public class L1T1v3Test
{
    @org.junit.Test
    public void chain()
    {
        assertEquals(21, L1T1v3.chain(19));
        assertEquals(525, L1T1v3.chain(837799));
    }
}