import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SvertkaTest {
    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(outStream));
    }

    @After
    public void clean() {
        System.setOut(null);
    }

    @Test
    public void main() {
        Svertka.main(new String[]{"1,3,4,5,6,7,8,9,11,12,13,14,15"});
        assertEquals("Строка до свертки: 1,3,4,5,6,7,8,9,11,12,13,14,15\nСтрока после свертки: 1,3-9,11-15", outStream.toString());
    }
}