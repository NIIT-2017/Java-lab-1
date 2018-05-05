import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SymbolsDemoTest
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
    public void printSymbols_0() {
        SymbolsDemo.printSymbols("0");
        assertEquals("0.\n   * * *   \n  *     *  \n *       * \n *       * \n *       * \n  *     *  \n   * * *   \n",outStream.toString());
    }
    @Test
    public void printSymbols_1() {
        SymbolsDemo.printSymbols("1");
        assertEquals("1.\n     *     \n   * *     \n     *     \n     *     \n     *     \n     *     \n   * * *   \n",outStream.toString());
    }
    @Test
    public void printSymbols_2() {
        SymbolsDemo.printSymbols("2");
        assertEquals("2.\n   * * *    \n *       *  \n       *    \n     *      \n   *        \n *          \n * * * * *  \n",outStream.toString());
    }
    @Test
    public void printSymbols_3() {
        SymbolsDemo.printSymbols("3");
        assertEquals("3.\n   * * *    \n *       *  \n         *  \n     * *    \n         *  \n *       *  \n   * * *    \n",outStream.toString());
    }
    @Test
    public void printSymbols_4() {
        SymbolsDemo.printSymbols("4");
        assertEquals("4.\n       *     \n     * *     \n   *   *     \n *     *     \n * * * * * * \n       *     \n       *     \n",outStream.toString());
    }

    @Test
    public void printSymbols_01234() {
        SymbolsDemo.printSymbols("01234");
        assertEquals("01234.\n   * * *        *        * * *       * * *           *     \n  *     *     * *      *       *   *       *       * *     \n *       *      *            *             *     *   *     \n *       *      *          *           * *     *     *     \n *       *      *        *                 *   * * * * * * \n  *     *       *      *           *       *         *     \n   * * *      * * *    * * * * *     * * *           *     \n", outStream.toString());
    }

    @Test
    public void printSymbols_56789() {
        SymbolsDemo.printSymbols("56789");
        assertEquals("56789.\n * * * * *         *     * * * * *     * * *       * * *    \n *               *               *   *       *   *       *  \n *             *               *     *       *   *       *  \n * * * *     * * * *         *         * * *       * * * *  \n         *   *       *     *         *       *           *  \n         *   *       *   *           *       *   *       *  \n * * * *       * * *     *             * * *       * * *    \n",outStream.toString());
    }

    @Test
    public void printSymbols_0123456789() {
        SymbolsDemo.printSymbols("0123456789");
        assertEquals("0123456789.\n   * * *        *        * * *       * * *           *      * * * * *         *     * * * * *     * * *       * * *    \n  *     *     * *      *       *   *       *       * *      *               *               *   *       *   *       *  \n *       *      *            *             *     *   *      *             *               *     *       *   *       *  \n *       *      *          *           * *     *     *      * * * *     * * * *         *         * * *       * * * *  \n *       *      *        *                 *   * * * * * *          *   *       *     *         *       *           *  \n  *     *       *      *           *       *         *              *   *       *   *           *       *   *       *  \n   * * *      * * *    * * * * *     * * *           *      * * * *       * * *     *             * * *       * * *    \n",outStream.toString());
    }

    @Test
    public void printSymbols_012345() {
        SymbolsDemo.printSymbols("012345");
        assertEquals("012345.\n" +
        "   * * *        *        * * *       * * *           *      * * * * *  \n" +
        "  *     *     * *      *       *   *       *       * *      *          \n" +
        " *       *      *            *             *     *   *      *          \n" +
        " *       *      *          *           * *     *     *      * * * *    \n" +
        " *       *      *        *                 *   * * * * * *          *  \n" +
        "  *     *       *      *           *       *         *              *  \n" +
        "   * * *      * * *    * * * * *     * * *           *      * * * *    \n", outStream.toString());
    }
}
