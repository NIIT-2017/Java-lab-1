import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SymbolsTest
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
    public void symbols_0() {
        Symbols.symbols("0");
        assertEquals("   * * *   \n  *     *  \n *       * \n *       * \n *       * \n  *     *  \n   * * *   \n", outStream.toString());
    }
    @Test
    public void symbols_1() {
        Symbols.symbols("1");
        assertEquals("     *     \n   * *     \n     *     \n     *     \n     *     \n     *     \n   * * *   \n", outStream.toString());
    }
    @Test
    public void symbols_2() {
        Symbols.symbols("2");
        assertEquals("   * * *    \n *       *  \n       *    \n     *      \n   *        \n *          \n * * * * *  \n", outStream.toString());
    }
    @Test
    public void symbols_3() {
        Symbols.symbols("3");
        assertEquals("   * * *    \n *       *  \n         *  \n     * *    \n         *  \n *       *  \n   * * *    \n", outStream.toString());
    }
    @Test
    public void symbols_4() {
        Symbols.symbols("4");
        assertEquals("       *     \n     * *     \n   *   *     \n *     *     \n * * * * * * \n       *     \n       *     \n", outStream.toString());
    }
    @Test
    public void symbols_5() {
        Symbols.symbols("5");
        assertEquals(" * * * * *  \n *          \n *          \n * * * *    \n         *  \n         *  \n * * * *    \n", outStream.toString());
    }
    @Test
    public void symbols_6() {
        Symbols.symbols("6");
        assertEquals("       *    \n     *      \n   *        \n * * * *    \n *       *  \n *       *  \n   * * *    \n", outStream.toString());
    }
    @Test
    public void symbols_7() {
        Symbols.symbols("7");
        assertEquals(" * * * * *  \n         *  \n       *    \n     *      \n   *        \n *          \n *          \n", outStream.toString());
    }
    @Test
    public void symbols_8() {
        Symbols.symbols("8");
        assertEquals("   * * *    \n *       *  \n *       *  \n   * * *    \n *       *  \n *       *  \n   * * *    \n", outStream.toString());
    }
    @Test
    public void symbols_9() {
        Symbols.symbols("9");
        assertEquals("   * * *    \n *       *  \n *       *  \n   * * * *  \n         *  \n *       *  \n   * * *    \n", outStream.toString());
    }

    @Test
    public void symbols_01234() {
        Symbols.symbols("01234");
        assertEquals("   * * *        *        * * *       * * *           *     \n  *     *     * *      *       *   *       *       * *     \n *       *      *            *             *     *   *     \n *       *      *          *           * *     *     *     \n *       *      *        *                 *   * * * * * * \n  *     *       *      *           *       *         *     \n   * * *      * * *    * * * * *     * * *           *     \n", outStream.toString());
    }

    @Test
    public void symbols_56789() {
        Symbols.symbols("56789");
        assertEquals(" * * * * *         *     * * * * *     * * *       * * *    \n *               *               *   *       *   *       *  \n *             *               *     *       *   *       *  \n * * * *     * * * *         *         * * *       * * * *  \n         *   *       *     *         *       *           *  \n         *   *       *   *           *       *   *       *  \n * * * *       * * *     *             * * *       * * *    \n",outStream.toString());
    }

    @Test
    public void symbols_0123456789() {
        Symbols.symbols("0123456789");
        assertEquals("   * * *        *        * * *       * * *           *      * * * * *         *     * * * * *     * * *       * * *    \n  *     *     * *      *       *   *       *       * *      *               *               *   *       *   *       *  \n *       *      *            *             *     *   *      *             *               *     *       *   *       *  \n *       *      *          *           * *     *     *      * * * *     * * * *         *         * * *       * * * *  \n *       *      *        *                 *   * * * * * *          *   *       *     *         *       *           *  \n  *     *       *      *           *       *         *              *   *       *   *           *       *   *       *  \n   * * *      * * *    * * * * *     * * *           *      * * * *       * * *     *             * * *       * * *    \n", outStream.toString());
    }
}
