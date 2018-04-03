import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PrintNamberTest {

    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut((new PrintStream(outStream)));
    }

    @After
    public void clean() {
        System.setOut(null);
    }

    @Test
    public void main() {
        PrintNamber.main(new String[]{"41072819"});
        String arrStr =     "   *    *    ***   *****  ***   ***   *   **** \n" +
                            "  **   **   *   *      * *   * *   * **  *   * \n" +
                            " * *    *  *     *    *  *  *  *   *  *  *   * \n" +
                            "*  *    *  *     *   *     *    ***   *   **** \n" +
                            "******  *  *     *  *     *    *   *  *      * \n" +
                            "   *    *   *   *  *     *     *   *  *      * \n" +
                            "   *   ***   ***   *     *****  ***  ***     * \n";
        assertEquals(arrStr, outStream.toString());
    }
}