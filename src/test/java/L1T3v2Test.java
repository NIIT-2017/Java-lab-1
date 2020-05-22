import static org.junit.Assert.*;
public class L1T3v2Test
{
    @org.junit.Test
    public void zoom()
    {
        assertArrayEquals(new int[]{1},L1T3v2.zoom("1"));//test naoborot,sleva otvet,sprava vvod
        assertArrayEquals(new int[]{4,5,6,7},L1T3v2.zoom("4-7"));
        assertArrayEquals(new int[]{16,17,18,19,20},L1T3v2.zoom("16-20"));
    }
}