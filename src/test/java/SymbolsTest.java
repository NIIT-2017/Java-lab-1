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
        assertEquals("   * * *   \r\n  *     *  \r\n *       * \r\n *       * \r\n *       * \r\n  *     *  \r\n   * * *   \r\n", outStream.toString());
    }
    @Test
    public void symbols_1() {
        Symbols.symbols("1");
        assertEquals("     *     \r\n   * *     \r\n     *     \r\n     *     \r\n     *     \r\n     *     \r\n   * * *   \r\n", outStream.toString());
    }
    @Test
    public void symbols_2() {
        Symbols.symbols("2");
        assertEquals("   * * *    \r\n *       *  \r\n       *    \r\n     *      \r\n   *        \r\n *          \r\n * * * * *  \r\n", outStream.toString());
    }
    @Test
    public void symbols_3() {
        Symbols.symbols("3");
        assertEquals("   * * *    \r\n *       *  \r\n         *  \r\n     * *    \r\n         *  \r\n *       *  \r\n   * * *    \r\n", outStream.toString());
    }
    @Test
    public void symbols_4() {
        Symbols.symbols("4");
        assertEquals("       *     \r\n     * *     \r\n   *   *     \r\n *     *     \r\n * * * * * * \r\n       *     \r\n       *     \r\n", outStream.toString());
    }
    @Test
    public void symbols_5() {
        Symbols.symbols("5");
        assertEquals(" * * * * *  \r\n *          \r\n *          \r\n * * * *    \r\n         *  \r\n         *  \r\n * * * *    \r\n", outStream.toString());
    }
    @Test
    public void symbols_6() {
        Symbols.symbols("6");
        assertEquals("       *    \r\n     *      \r\n   *        \r\n * * * *    \r\n *       *  \r\n *       *  \r\n   * * *    \r\n", outStream.toString());
    }
    @Test
    public void symbols_7() {
        Symbols.symbols("7");
        assertEquals(" * * * * *  \r\n         *  \r\n       *    \r\n     *      \r\n   *        \r\n *          \r\n *          \r\n", outStream.toString());
    }
    @Test
    public void symbols_8() {
        Symbols.symbols("8");
        assertEquals("   * * *    \r\n *       *  \r\n *       *  \r\n   * * *    \r\n *       *  \r\n *       *  \r\n   * * *    \r\n", outStream.toString());
    }
    @Test
    public void symbols_9() {
        Symbols.symbols("9");
        assertEquals("   * * *    \r\n *       *  \r\n *       *  \r\n   * * * *  \r\n         *  \r\n *       *  \r\n   * * *    \r\n", outStream.toString());
    }

    @Test
    public void symbols_01234() {
        Symbols.symbols("01234");
        assertEquals("   * * *        *        * * *       * * *           *     \r\n  *     *     * *      *       *   *       *       * *     \r\n *       *      *            *             *     *   *     \r\n *       *      *          *           * *     *     *     \r\n *       *      *        *                 *   * * * * * * \r\n  *     *       *      *           *       *         *     \r\n   * * *      * * *    * * * * *     * * *           *     \r\n", outStream.toString());
    }

    @Test
    public void symbols_56789() {
        Symbols.symbols("56789");
        assertEquals(" * * * * *         *     * * * * *     * * *       * * *    \r\n *               *               *   *       *   *       *  \r\n *             *               *     *       *   *       *  \r\n * * * *     * * * *         *         * * *       * * * *  \r\n         *   *       *     *         *       *           *  \r\n         *   *       *   *           *       *   *       *  \r\n * * * *       * * *     *             * * *       * * *    \r\n",outStream.toString());
    }

    @Test
    public void symbols_0123456789() {
        Symbols.symbols("0123456789");
        assertEquals("   * * *        *        * * *       * * *           *      * * * * *         *     * * * * *     * * *       * * *    \r\n  *     *     * *      *       *   *       *       * *      *               *               *   *       *   *       *  \r\n *       *      *            *             *     *   *      *             *               *     *       *   *       *  \r\n *       *      *          *           * *     *     *      * * * *     * * * *         *         * * *       * * * *  \r\n *       *      *        *                 *   * * * * * *          *   *       *     *         *       *           *  \r\n  *     *       *      *           *       *         *              *   *       *   *           *       *   *       *  \r\n   * * *      * * *    * * * * *     * * *           *      * * * *       * * *     *             * * *       * * *    \r\n", outStream.toString());
    }

    @Test
    public void symbols_0123_8998_3210() {
        Symbols.symbols("01234567899876543210");
        assertEquals("   * * *        *        * * *       * * *           *      * * * * *         *     * * * * *     * * *       * * *       * * *       * * *     * * * * *         *     * * * * *         *        * * *       * * *         *        * * *   \r\n  *     *     * *      *       *   *       *       * *      *               *               *   *       *   *       *   *       *   *       *           *       *       *               * *      *       *   *       *     * *       *     *  \r\n *       *      *            *             *     *   *      *             *               *     *       *   *       *   *       *   *       *         *       *         *             *   *              *         *         *      *       * \r\n *       *      *          *           * *     *     *      * * * *     * * * *         *         * * *       * * * *     * * * *     * * *         *       * * * *     * * * *     *     *          * *         *           *      *       * \r\n *       *      *        *                 *   * * * * * *          *   *       *     *         *       *           *           *   *       *     *         *       *           *   * * * * * *          *     *             *      *       * \r\n  *     *       *      *           *       *         *              *   *       *   *           *       *   *       *   *       *   *       *   *           *       *           *         *      *       *   *               *       *     *  \r\n   * * *      * * *    * * * * *     * * *           *      * * * *       * * *     *             * * *       * * *       * * *       * * *     *             * * *     * * * *           *        * * *     * * * * *     * * *      * * *   \r\n", outStream.toString());
    }

    @Test
    public void symbols_00010203_1920() {
        Symbols.symbols("000102030405060708091011121314151617181920");
        assertEquals("   * * *      * * *      * * *        *        * * *      * * *       * * *      * * *       * * *          *        * * *    * * * * *     * * *          *       * * *    * * * * *     * * *      * * *       * * *      * * *         *        * * *        *          *          *        * * *         *        * * *         *            *          *      * * * * *       *            *         *      * * * * *       *        * * *         *        * * *       * * *       * * *   \r\n  *     *    *     *    *     *     * *       *     *   *       *    *     *   *       *    *     *       * *       *     *   *            *     *       *        *     *           *    *     *   *       *    *     *   *       *     * *       *     *     * *        * *        * *      *       *     * *      *       *     * *          * *        * *      *             * *          *         * *              *     * *      *       *     * *      *       *   *       *    *     *  \r\n *       *  *       *  *       *      *      *       *        *     *       *          *   *       *    *   *      *       *  *           *       *    *         *       *        *     *       *  *       *   *       *  *       *       *      *       *      *          *          *            *         *              *       *        *   *          *      *               *        *             *            *         *      *       *       *      *       *         *     *       * \r\n *       *  *       *  *       *      *      *       *      *       *       *      * *     *       *  *     *      *       *  * * * *     *       *  * * * *     *       *      *       *       *    * * *     *       *    * * * *       *      *       *      *          *          *          *           *          * *         *      *     *          *      * * * *         *      * * * *         *          *           *        * * *         *        * * * *       *       *       * \r\n *       *  *       *  *       *      *      *       *    *         *       *          *   *       *  * * * * * *  *       *          *   *       *  *       *   *       *    *         *       *  *       *   *       *          *       *      *       *      *          *          *        *             *              *       *      * * * * * *      *              *       *      *       *       *        *             *      *       *       *              *     *         *       * \r\n  *     *    *     *    *     *       *       *     *   *            *     *   *       *    *     *         *       *     *           *    *     *   *       *    *     *   *            *     *   *       *    *     *   *       *       *       *     *       *          *          *      *               *      *       *       *            *          *              *       *      *       *       *      *               *      *       *       *      *       *   *            *     *  \r\n   * * *      * * *      * * *      * * *      * * *    * * * * *     * * *      * * *       * * *          *        * * *    * * * *       * * *      * * *       * * *    *             * * *      * * *       * * *      * * *       * * *      * * *      * * *      * * *      * * *    * * * * *     * * *      * * *       * * *          *        * * *    * * * *       * * *      * * *       * * *    *             * * *      * * *       * * *      * * *     * * * * *     * * *   \r\n", outStream.toString());
    }

    @Test
    public void symbols_00010203_3940() {
        Symbols.symbols("0001020304050607080910111213141516171819202122232425262728293031323334353637383940");
        assertEquals("   * * *      * * *      * * *        *        * * *      * * *       * * *      * * *       * * *          *        * * *    * * * * *     * * *          *       * * *    * * * * *     * * *      * * *       * * *      * * *         *        * * *        *          *          *        * * *         *        * * *         *            *          *      * * * * *       *            *         *      * * * * *       *        * * *         *        * * *       * * *       * * *      * * *         *        * * *       * * *       * * *       * * *       * * *           *        * * *     * * * * *     * * *           *       * * *     * * * * *     * * *       * * *       * * *       * * *       * * *       * * *      * * *         *        * * *       * * *       * * *       * * *       * * *           *        * * *     * * * * *     * * *           *       * * *     * * * * *     * * *       * * *       * * *       * * *           *        * * *   \r\n  *     *    *     *    *     *     * *       *     *   *       *    *     *   *       *    *     *       * *       *     *   *            *     *       *        *     *           *    *     *   *       *    *     *   *       *     * *       *     *     * *        * *        * *      *       *     * *      *       *     * *          * *        * *      *             * *          *         * *              *     * *      *       *     * *      *       *   *       *    *     *   *       *     * *      *       *   *       *   *       *   *       *   *       *       * *      *       *   *           *       *       *       *       *           *   *       *   *       *   *       *   *       *   *       *    *     *   *       *     * *      *       *   *       *   *       *   *       *   *       *       * *      *       *   *           *       *       *       *       *           *   *       *   *       *   *       *   *       *       * *       *     *  \r\n *       *  *       *  *       *      *      *       *        *     *       *          *   *       *    *   *      *       *  *           *       *    *         *       *        *     *       *  *       *   *       *  *       *       *      *       *      *          *          *            *         *              *       *        *   *          *      *               *        *             *            *         *      *       *       *      *       *         *     *       *        *         *            *           *           *             *         *       *   *            *     *                 *       *               *           *           *     *       *         *     *       *           *   *       *          *       *              *         *             *           *           *     *   *              *   *                   *     *                 *         *             *   *       *           *   *       *     *   *      *       * \r\n *       *  *       *  *       *      *      *       *      *       *       *      * *     *       *  *     *      *       *  * * * *     *       *  * * * *     *       *      *       *       *    * * *     *       *    * * * *       *      *       *      *          *          *          *           *          * *         *      *     *          *      * * * *         *      * * * *         *          *           *        * * *         *        * * * *       *       *       *      *           *          *           *           *           * *         *       *     *          *       * * * *         *       * * * *         *           *           *         * * *         *         * * * *       * *     *       *      * *         *          * *         *           * *         * *         * *     *     *          * *     * * * *         * *     * * * *         * *         *           * *       * * *         * *       * * * *   *     *      *       * \r\n *       *  *       *  *       *      *      *       *    *         *       *          *   *       *  * * * * * *  *       *          *   *       *  *       *   *       *    *         *       *  *       *   *       *          *       *      *       *      *          *          *        *             *              *       *      * * * * * *      *              *       *      *       *       *        *             *      *       *       *              *     *         *       *    *             *        *           *           *                 *     *         * * * * * *    *                 *     *         *       *     *           *           *         *       *     *                 *           *   *       *          *       *              *     *                 *           *           *   * * * * * *          *           *           *   *       *           *     *                 *   *       *           *           *   * * * * * *  *       * \r\n  *     *    *     *    *     *       *       *     *   *            *     *   *       *    *     *         *       *     *           *    *     *   *       *    *     *   *            *     *   *       *    *     *   *       *       *       *     *       *          *          *      *               *      *       *       *            *          *              *       *      *       *       *      *               *      *       *       *      *       *   *            *     *   *               *      *           *           *           *       *   *                 *      *                   *   *           *       *   *           *           *           *       *   *           *       *   *       *    *     *   *       *       *      *       *   *           *       *   *       *   *       *         *      *       *           *   *       *   *       *   *       *   *           *       *   *       *   *       *   *       *         *       *     *  \r\n   * * *      * * *      * * *      * * *      * * *    * * * * *     * * *      * * *       * * *          *        * * *    * * * *       * * *      * * *       * * *    *             * * *      * * *       * * *      * * *       * * *      * * *      * * *      * * *      * * *    * * * * *     * * *      * * *       * * *          *        * * *    * * * *       * * *      * * *       * * *    *             * * *      * * *       * * *      * * *     * * * * *     * * *    * * * * *     * * *    * * * * *   * * * * *   * * * * *     * * *     * * * * *         *      * * * * *   * * * *     * * * * *     * * *     * * * * *   *           * * * * *     * * *     * * * * *     * * *       * * *       * * *      * * *       * * *      * * *     * * * * *     * * *       * * *       * * *           *        * * *     * * * *       * * *       * * *       * * *     *             * * *       * * *       * * *       * * *           *        * * *   \r\n", outStream.toString());
    }
}