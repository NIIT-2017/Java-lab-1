import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ReduceTest {

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
        Reduce.main (new String [] {"1,2,3,4,10,11,12,8"});
        assertEquals ("1-4,10-12,8", outContent.toString());

    }
}