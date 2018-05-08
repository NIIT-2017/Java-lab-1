import static org.junit.Assert.*;

public class CollatzDemoTest
{
    @org.junit.Test
    public void collatz1to1Math() {
        assertEquals(4, CollatzDemo.collatz1tolMath(1));
    }

    @org.junit.Test
    public void collatz1to2Math() {
        assertEquals(4, CollatzDemo.collatz1tolMath(2));
    }

    @org.junit.Test
    public void collatz1to3Math() {
        assertEquals(8, CollatzDemo.collatz1tolMath(3));
    }

    @org.junit.Test
    public void collatz1to4Math() {
        assertEquals(8, CollatzDemo.collatz1tolMath(4));
    }

    @org.junit.Test
    public void collatz1to5Math() {
        assertEquals(8, CollatzDemo.collatz1tolMath(5));
    }

    @org.junit.Test
    public void collatz1to10Math() {
        assertEquals(20, CollatzDemo.collatz1tolMath(10));
    }

    @org.junit.Test
    public void collatz1to100Math() {
        assertEquals(119, CollatzDemo.collatz1tolMath(100));
    }

    @org.junit.Test
    public void collatz1to837799Math() {
        assertEquals(525, CollatzDemo.collatz1tolMath(837799));
    }

    @org.junit.Test
    public void collatz1to12345Math() {
        int resArr[] = {4,4,8,8,8};
        for(int i=1; i <= 5; i++) assertEquals(resArr[i-1], CollatzDemo.collatz1tolMath(i));
    }

    @org.junit.Test
    public void collatz1to1000000Res() {
        assertEquals(525, CollatzDemo.collatz1to1000000Res());
    }
}
