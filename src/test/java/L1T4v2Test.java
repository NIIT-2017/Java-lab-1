import static org.junit.Assert.*;
public class L1T4v2Test
{
    @org.junit.Test
    public void zoom()
    {
        assertEquals("0,4-8,16-20,100", L1T4v2.zoom("0,4,5,6,7,8,16,17,18,19,20,100"));
    }
}