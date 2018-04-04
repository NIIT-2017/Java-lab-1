import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class bigNumbersTest {
   /* private final ByteArrayOutputStream outStream=new ByteArrayOutputStream();
    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(null);
    }
*/
    @Test
    void create() {
        BigNumbers BigNumbers=new BigNumbers("78");
        String []result=BigNumbers.create();
        String[] test = {
                " *****  *** ",
                "     * *   *",
                "    *  *   *",
                "   *    *** ",
                "  *    *   *",
                " *     *   *",
                " *      *** "
        };

        assertArrayEquals(test,result);
    }



}