import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Task5PrintBigNumberTest {

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
    public void stringToNumber() {
        BigNumber testObject = new BigNumber ("0");
        String inputTestArray[] = {"7","8","9"};
        int outputTestArray[] = testObject.stringToNumber(inputTestArray);
        assertArrayEquals(new int[]{7,8,9},outputTestArray);
    }

    @Test
    public void createOutputString() {
        BigNumber testObject = new BigNumber ("0");
        String outputTestArray[] = testObject.createOutputString(2);
        assertArrayEquals(new String[]{"",""},outputTestArray);
    }

    @Test
    public void setBigNumber() {
        //BigNumber testObject = new BigNumber ("987");
        BigNumber testObject = new BigNumber ("0");
        int testInputArray[] = {9,8,7};
        String testOutputString[] = {"","","","","","",""};
        //testObject.setBigNumber(testObject.inputNumber,testObject.outputString);
        testObject.setBigNumber(testInputArray,testOutputString);
        assertArrayEquals(new String []{"  ***    ***  *******",
                                        " *   *  *   *      * ",
                                        " *   *  *   *     *  ",
                                        "  ****   ***    ***  ",
                                        "     *  *   *   *    ",
                                        " *   *  *   *   *    ",
                                        "  ***    ***    *    "}, testOutputString/*testObject.outputString*/);
    }

    @Test
    public void getBigNumber() {
        BigNumber testObject = new BigNumber ("0");
        String testOutputString[] = {"  ***    ***  *******",
                                     " *   *  *   *      * ",
                                     " *   *  *   *     *  ",
                                     "  ****   ***    ***  ",
                                     "     *  *   *   *    ",
                                     " *   *  *   *   *    ",
                                     "  ***    ***    *    "};

        testObject.getBigNumber(testOutputString);
        assertEquals("  ***    ***  *******\n" +
                              " *   *  *   *      * \n" +
                              " *   *  *   *     *  \n" +
                              "  ****   ***    ***  \n" +
                              "     *  *   *   *    \n" +
                              " *   *  *   *   *    \n" +
                              "  ***    ***    *    \n", outStream.toString());
    }
}