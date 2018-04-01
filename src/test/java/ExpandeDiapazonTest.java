import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by khvostovai on 26.03.2018.
 */
public class ExpandeDiapazonTest {
    private final ByteArrayOutputStream ounput = new ByteArrayOutputStream();
    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(ounput));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }

    @Test
    public void mainWhithoutParam() throws Exception {
        ExpandeDiapazon.main(new String[] {});
        assertEquals("Нет параметров, введите строку.\n",ounput.toString());
    }

    @Test
    public void mainWhithParam() throws Exception {
        ExpandeDiapazon.main(new String[] {"1-3,4,5,6"});
        assertEquals("1,2,3,4,5,6\n",ounput.toString());
    }

    @org.junit.Test
    public void expDiapazonbegin() throws Exception {
        assertEquals("1,2,3,4,5,6",ExpandeDiapazon.expDiapazon("1-3,4,5,6"));
    }

    @org.junit.Test
    public void expDiapazonmid() throws Exception {
        assertEquals("1,2,3,4,5,6",ExpandeDiapazon.expDiapazon("1,2-5,6"));
    }
    @org.junit.Test
    public void expDiapazonbend() throws Exception {
        assertEquals("1,2,3,4,5,6",ExpandeDiapazon.expDiapazon("1,2,3,4-6"));
    }
}