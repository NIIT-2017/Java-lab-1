import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Task5PrintBigNumberMainTest {

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
        Task5PrintBigNumber.main(new String[]{"41072819"});
        assertEquals(" *   *    *     ***  *******  ***    ***     *     ***  \n" +
                              " *   *  * *    *   *      *  *   *  *   *  * *    *   * \n" +
                              " *   *    *   *     *    *       *  *   *    *    *   * \n" +
                              " *****    *   *     *  ***      *    ***     *     **** \n" +
                              "     *    *   *     *  *       *    *   *    *        * \n" +
                              "     *    *    *   *   *      *     *   *    *    *   * \n" +
                              "     *   ***    ***    *     *****   ***    ***    ***  \n",outStream.toString());
    }
}