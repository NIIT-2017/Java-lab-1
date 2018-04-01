import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by khvostovai on 27.03.2018.
 */
public class PoolTest {
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
        Pool.main(new String[]{});
        assertEquals("21991.15 - цена дорожки\n" +
                              "50265.48 - цена ограды\n",outputStream.toString());
    }

}
