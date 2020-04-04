import static org.junit.jupiter.api.Assertions.*;
class L1T3Test
{
    @org.junit.jupiter.api.Test
    void zoom()
    {
        assertArrayEquals(new int[]{1},L1T3.zoom("1"));
        assertArrayEquals(new int[]{4,5,6,7},L1T3.zoom("4-7"));
        assertArrayEquals(new int[]{16,17,18,19,20},L1T3.zoom("16-20"));
    }
}