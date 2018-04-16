import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SqrtDemoTest
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
    public void printSqrt_2_15() {
        SqrtDemo.printSqrt(2,15);
        assertEquals("Sqrt of 2.0 (delta = 1.0E-15) = 1.414213562373095\r\n", outStream.toString());
    }

    @Test
    public void printSqrt_3_14() {
        SqrtDemo.printSqrt(3,14);
        assertEquals("Sqrt of 3.0 (delta = 1.0E-14) = 1.7320508075688772\r\n", outStream.toString());
    }

    @Test
    public void printSqrt_5_13() {
        SqrtDemo.printSqrt(5,13);
        assertEquals("Sqrt of 5.0 (delta = 1.0E-13) = 2.23606797749979\r\n", outStream.toString());
    }

    @Test
    public void main() {
        SqrtDemo.main(new String[]{""});
        assertEquals("Sqrt of 7.0 (delta = 1.0E-15) = 2.6457513110645907\r\n", outStream.toString());
    }
}