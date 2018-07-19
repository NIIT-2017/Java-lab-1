import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CircleMainTest {private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut((new PrintStream(outStream)));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }

    @Test
    public void main() {
        CircleMain.main(new String[] {""});
        assertEquals("Зазор между Землёй и верёвкой0.15915494319051504m\n" +
                "Cтоимость материалов для бетонной дорожки вокруг круглого бассейна 21991.14857512855 рублей\n" +
                "Cтоимость материалов ограды вокруг бассейна (вместе с дорожкой) 72256.63103256523 рублей", outStream.toString());
    }
}