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
    public void main() {
        Collatz.main(new String[] {""});
        assertEquals("Число имеющее наибольшую длинну последовательности Коллатца: 837799, её длинна систавляет: 524", outStream.toString());
    }
}