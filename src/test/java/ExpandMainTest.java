import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ExpandMainTest {


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
    public void main() {
        Expand.main(new String[]{"1,2,4-7,18-21"});
        assertEquals("1,2,4,5,6,7,18,19,20,21.\n", outStream.toString());
    }

}
