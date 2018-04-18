import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Task1CollatzMainTest {

    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut((new PrintStream(outStream)));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }

    @Test
    public void main() {
        Task1Collatz.main(new String[] {""});
        assertEquals("Максимальная длинна последовательности в диапазоне от 1 до 1000000: 524, при начальном числе 837799", outStream.toString());
    }
}