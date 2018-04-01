import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by khvostovai on 27.03.2018.
 */
public class EarthAndRopeTest {
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
        double ference =EarthAndRope.radiusEarth*2*Math.PI;
        ference+=1.0;
        double difRadius =(ference/(2*Math.PI))-EarthAndRope.radiusEarth;
        EarthAndRope.main(new String[]{});
        String result = "Растояние между зелмей и веревкой примерно "+difRadius+" м\n";
        assertEquals(result,outputStream.toString());
    }

}