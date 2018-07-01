import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ExpandTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);

    }

    @Test
    public void main() {
        Expand.main (new String [] {"1,2,1-7,18"});
        assertEquals ("1,2,1,2,3,4,5,6,7,18", outContent.toString());

    }
}
