import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DrawNumbersTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(output));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }

    @Test
    public void drawLine() {
        DrawNumbers myNumbers = new DrawNumbers("5912345678909");
        String[] outcomeLine = myNumbers.drawLine();
        String[] resultTest = {
                "*******   *******       *    *******    *****   *     *   *******         *   *******   *******   *******   *******  *******   ",
                "*         *     *      **    *     *   *     *  *     *   *             *           *   *     *   *     *   *     *  *     *   ",
                "*         *     *     * *          *         *  *     *   *          *              *   *     *   *     *   *     *  *     *   ",
                "*******   *******    *  *         *       **    *******   *******   *******         *    *****    *******   *     *  *******   ",
                "      *         *       *       *            *        *         *   *     *       *     *     *         *   *     *        *   ",
                "      *      *          *     *        *     *        *         *   *     *     *       *     *      *      *     *     *      ",
                "*******   *             *    *******    *****         *   *******   *******   *         *******   *         *******  *         "
        };
        assertArrayEquals(resultTest, outcomeLine);
    }

}