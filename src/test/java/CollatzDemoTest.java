import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CollatzDemoTest
{
    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(outStream));
    }

    @After
    public void clean() {
        System.setOut(null);
    }

    @Test
    public void printQmax1tol_1() {
        CollatzDemo.printQmax1tol(1);
        assertEquals("Collatz Qmax 1 to 1 = 4\r\n", outStream.toString());
    }
    @Test
    public void printQmax1tol_2() {
        CollatzDemo.printQmax1tol(2);
        assertEquals("Collatz Qmax 1 to 2 = 4\r\n", outStream.toString());
    }

    @Test
    public void printQmax1tol_3() {
        CollatzDemo.printQmax1tol(3);
        assertEquals("Collatz Qmax 1 to 3 = 8\r\n", outStream.toString());
    }

    @Test
    public void printQmax1tol_4() {
        CollatzDemo.printQmax1tol(4);
        assertEquals("Collatz Qmax 1 to 4 = 8\r\n", outStream.toString());
    }

    @ Test
    public void printQmax1tol_5() {
        CollatzDemo.printQmax1tol(5);
        assertEquals("Collatz Qmax 1 to 5 = 8\r\n", outStream.toString());
    }

    @Test
    public void printQmax1tol_10() {
        CollatzDemo.printQmax1tol(10);
        assertEquals("Collatz Qmax 1 to 10 = 20\r\n", outStream.toString());
    }

    @Test
    public void printQmax1tol_100() {
        CollatzDemo.printQmax1tol(100);
        assertEquals("Collatz Qmax 1 to 100 = 119\r\n", outStream.toString());
    }

    @Test
    public void printQmax1tol_837799() {
        CollatzDemo.printQmax1tol(837799);
        assertEquals("Collatz Qmax 1 to 837799 = 525\r\n", outStream.toString());
    }

    @Test
    public void printQmax1tol_1_5() {
        for(int i=1; i <= 5; i++) CollatzDemo.printQmax1tol(i);
        assertEquals("Collatz Qmax 1 to 1 = 4\r\nCollatz Qmax 1 to 2 = 4\r\nCollatz Qmax 1 to 3 = 8\r\nCollatz Qmax 1 to 4 = 8\r\nCollatz Qmax 1 to 5 = 8\r\n", outStream.toString());
    }

    @Test
    public void main() {
        CollatzDemo.main(new String[]{""});
        assertEquals("Collatz Qmax 1 to 1000000 = 525\r\n", outStream.toString());
    }
}