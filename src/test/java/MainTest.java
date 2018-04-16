import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest
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
    public void main() {
        Main.main(new String[]{""});
        assertEquals(
"Collatz Qmax 1 to 1000000 = 525\r\n" +
        "\r\n" +
        "Sqrt of 7.0 (delta = 1.0E-15) = 2.6457513110645907\r\n" +
        "\r\n" +
        "1,2,3,5,8,10-11,13-15,18-22,23-28\r\n" +
        "1,2,3,5,8,10,11,13,14,15,18,19,20,21,22,23,24,25,26,27,28\r\n" +
        "\r\n" +
        "1,3,6,7,9,11,12,13,16,18,20,21,22,23,24,25\r\n" +
        "1,3,6-7,9,11-13,16,18,20-25\r\n" +
        "\r\n" +
        "012345\r\n" +
        "   * * *        *        * * *       * * *           *      * * * * *  \r\n" +
        "  *     *     * *      *       *   *       *       * *      *          \r\n" +
        " *       *      *            *             *     *   *      *          \r\n" +
        " *       *      *          *           * *     *     *      * * * *    \r\n" +
        " *       *      *        *                 *   * * * * * *          *  \r\n" +
        "  *     *       *      *           *       *         *              *  \r\n" +
        "   * * *      * * *    * * * * *     * * *           *      * * * *    \r\n" +
        "\r\n" +
        "Зазор равен 15.915507628960768 сантиметров\r\n" +
        "Стоимость дорожки и ограды равны 21991.13 и 50265.439999999995 рублей\r\n", outStream.toString());
    }
}