import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by kortez on 26.03.18.
 */
public class DevoutTest {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }
    //не цифры на входе
    @Test
    public void appendNum_not_num() throws Exception {
        Devout devout = new Devout();
        devout.appendNum("qwert");
        assertEquals("Не верный формат числа.\n",outputStream.toString());
    }
    //
    @Test
    public void appendNum() throws Exception {
        Devout devout = new Devout();
        devout.appendNum("12345");
        assertEquals("   *     ***    ***     *   *****  ",devout.bufferOut[0].toString());
        assertEquals("  **    *   *  *   *   **   *      ",devout.bufferOut[1].toString());
        assertEquals("   *    *  *       *  * *   *      ",devout.bufferOut[2].toString());
        assertEquals("   *      *     ***  *  *   *****  ",devout.bufferOut[3].toString());
        assertEquals("   *     *         * ******      * ",devout.bufferOut[4].toString());
        assertEquals("   *    *      *   *    *   *    * ",devout.bufferOut[5].toString());
        assertEquals("  ***   ****    ***     *    ****  ",devout.bufferOut[6].toString());
    }

    @Test
    public void printString() throws Exception {
        Devout devout = new Devout();
        devout.appendNum("12345");
        devout.printString();
        assertEquals(   "   *     ***    ***     *   *****  \n"+
                                "  **    *   *  *   *   **   *      \n"+
                                "   *    *  *       *  * *   *      \n"+
                                "   *      *     ***  *  *   *****  \n"+
                                "   *     *         * ******      * \n"+
                                "   *    *      *   *    *   *    * \n"+
                                "  ***   ****    ***     *    ****  \n",outputStream.toString());
    }
}