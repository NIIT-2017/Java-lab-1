import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by khvostovai on 26.03.2018.
 */
public class CollatzTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }

    @Test
    public void main() throws Exception {
        Collatz.main(new String[]{});
        assertEquals("максимальная последовательность у чилса 910107 , длинна последовательности 475\n",outputStream.toString());
    }

    @Test
    public void getColatz() throws Exception {
        assertEquals(20,Collatz.getColatz(19));
        assertEquals(111,Collatz.getColatz(27));
    }

    @Test
    public void maxColatz() throws Exception {
        String str = Collatz.maxColatz(5);
        assertEquals("максимальная последовательность у чилса 3 , длинна последовательности 7",str);
        str = Collatz.maxColatz(27);
        assertEquals("максимальная последовательность у чилса 27 , длинна последовательности 111",str);
    }

}