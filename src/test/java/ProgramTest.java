import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class ProgramTest {

    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut((new PrintStream(outStream)));
    }

    @After
    public void clean() {
        System.setOut(null);
    }

    @Test
    public void main() throws UnsupportedEncodingException {
        Program.main(new String[]{"3.1", "3"});
        assertEquals("Sqrt of 3.1 = 1.7607986949006773\n", outStream.toString("UTF-8"));
    }

}