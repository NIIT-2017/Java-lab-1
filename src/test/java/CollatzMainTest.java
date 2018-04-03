import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CollatzMainTest {

    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setup(){
        System.setOut((new PrintStream(outStream)));
    }

    @After
    public void clean(){
        System.setOut(null);
    }

    @Test
    public void main(){
        Collatz.main(new String[] {""});
        assertEquals("The number having the maximum length of the collatz sequence: 837799, its length is: 524\n", outStream.toString());

    }
}