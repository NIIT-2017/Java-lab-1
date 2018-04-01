import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by kortez on 26.03.18.
 */
public class NumbersTest {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    @Before
    public void setUp() throws Exception {
    System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }
    //без параметров
    @Test
    public void main_without_param() throws Exception {
        Numbers.main(new String[]{});
        assertEquals("Введите чило.\n",outputStream.toString());
    }
    //без параметров
    @Test
    public void main() throws Exception {
        Numbers.main(new String[]{"12345"});
        assertEquals(   "   *     ***    ***     *   *****  \n"+
                                "  **    *   *  *   *   **   *      \n"+
                                "   *    *  *       *  * *   *      \n"+
                                "   *      *     ***  *  *   *****  \n"+
                                "   *     *         * ******      * \n"+
                                "   *    *      *   *    *   *    * \n"+
                                "  ***   ****    ***     *    ****  \n",outputStream.toString());
    }
}