import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class NumberTest {
    private final ByteArrayOutputStream outStream=new ByteArrayOutputStream();
    private String []outPutString;

    @org.junit.Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outStream));
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.setOut(null);
    }


    @org.junit.Test
    public void main() throws Exception {
       Number.main(new String[]{"152697"});

        assertArrayEquals(new String[][]{
                {"   *  *****   ***    ***    ***   *****"},
                {"  **  *      *   *  *   *  *   *      *"},
                {" * *  *          *  *      *   *      *"},
                {"*  *  ****      *   ****    ****     * "},
                {"   *      *    *    *   *      *   *   "},
                {"   *      *   *     *   *     *    *   "},
                {"   *      *  *      *   *    *     *   "},
                {"   *  ****   *****   ***    *      *   "}
                }
                ,outStream.toString());
        }

    private void assertArrayEquals(String[][] strings, String string) {
    }


}
