import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ChislaTest {
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
    public void main() {
        Chisla.main(new String[]{"0"});
        assertEquals(  "  ***  \n *   * \n*     *\n*     *\n*     *\n *   * \n  ***  \n", outStream.toString());
    }
}