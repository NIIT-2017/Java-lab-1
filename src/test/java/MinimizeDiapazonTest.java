import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by kortez on 26.03.18.
 */
public class MinimizeDiapazonTest {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
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
        MinimizeDiapazon.main(new String[]{"1,2,3,4,5,6,7,8,9,10"});
        assertEquals("1-10\n",outputStream.toString());
    }
    @Test
    public void main_begin() throws Exception {
        MinimizeDiapazon.main(new String[]{"1,2,3,4,5-10"});
        assertEquals("1-10\n",outputStream.toString());
    }
    @Test
    public void main_end() throws Exception {
        MinimizeDiapazon.main(new String[]{"1-5,6,7,8,9,10"});
        assertEquals("1-10\n",outputStream.toString());
    }
    @Test
    public void minDiapazon() throws Exception {
        assertEquals("1-10",MinimizeDiapazon.minDiapazon("1,2,3,4,5,6,7,8,9,10"));
    }
    @Test
    public void minDiapazon_not_assert() throws Exception {
        assertEquals("1-5,8-10",MinimizeDiapazon.minDiapazon("1,2,3,4,5,8,9,10"));
    }
}