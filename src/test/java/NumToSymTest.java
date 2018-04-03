import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class NumToSymTest {
    private final ByteArrayOutputStream outStream=new ByteArrayOutputStream();
    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outStream));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }
    @Test
    public void transform() {
            NumToSym nts=new NumToSym(89);
            nts.transform();

            assertEquals("*******  *******  \n" +
                                  "*     *  *     *  \n" +
                                  "*     *  *     *  \n" +
                                  "*******  *******  \n" +
                                  "*     *        *  \n" +
                                  "*     *        *  \n" +
                                  "*******  *******  \n",outStream.toString());
    }
}