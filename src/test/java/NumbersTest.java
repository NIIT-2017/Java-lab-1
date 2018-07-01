import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class NumbersTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);

    }

    @Test
    public void main() {
        Numbers.main (new String [] {"195"});

        assertEquals ( "    * \t  *** \t******\t\n" +
                                "   ** \t *   *\t*     \t\n" +
                                "    * \t *   *\t***** \t\n" +
                                "    * \t  *** \t     *\t\n" +
                                "    * \t   *  \t     *\t\n" +
                                "    * \t  *   \t     *\t\n" +
                                "   ***\t *    \t***** \t\n", outContent.toString());

    }
}