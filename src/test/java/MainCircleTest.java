import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainCircleTest {

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
    public void main(){
        MainCircle.main(new String[]{""});
        String str = "The variation of the radius made up: 0.15915494319051504 m\n" +
                "The cost of materials necessary for the construction of the pool fence and walkway is: 87964.5943005142 r\n" +
                "The cost of materials required for the construction of a concrete path around the pool is: 21991.14857512855 r\n";
        assertEquals(str, outStream.toString());
    }
}