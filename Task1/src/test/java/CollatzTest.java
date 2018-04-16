import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class CollatzTest {
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
    public void collatz() {
        assertEquals(16,Collatz.collatz(5));
        assertEquals(525,Collatz.collatz(1000000));

    }


    @Test
    public void main() {
        Collatz.main((new String[]{""}));
        assertEquals("Max length of sequense is: 525. Number with max sequence is: 837799.",
                outStream.toString());

    }
}