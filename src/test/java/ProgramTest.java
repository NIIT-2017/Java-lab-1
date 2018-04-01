import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by kortez on 26.03.18.
 */
public class ProgramTest {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }
    //вызов без параметров
    @Test
    public void main_without_param() throws Exception {
        Program.main(new String[]{});
        assertEquals("Ведите параметры: arg [delta]\n",outputStream.toString());
    }
    //вызов с одним параметром arg
    @Test
    public void main_one_param() throws Exception {
        Program.main(new String[]{"5"});
        assertEquals("Sqrt of 5.0=2.236067977499978\n",outputStream.toString());
    }
    //вызов с двумя параметрами arg и delta
    @Test
    public void main_two_param() throws Exception {
        Program.main(new String[]{"5","0.0001"});
        assertEquals("Sqrt of 5.0=2.2360688956433634\n",outputStream.toString());
    }


}