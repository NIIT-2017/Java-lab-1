import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Task3DiapasonExpandMainTest {

    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut((new PrintStream(outStream)));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }

    @Test
    public void main() {
        Task3DiapasonExpand.main(new String[]{""});
        assertEquals("Input string: 1,2,4-7,18-21\nOutput string: 1,2,4,5,6,7,18,19,20,21", outStream.toString());
    }


}