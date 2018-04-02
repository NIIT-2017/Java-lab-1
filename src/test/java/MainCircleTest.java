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
    public void main() {
        MainCircle.main(new String[]{""});
        String str = new String("Изменение радиуса составило: 0.15915494319051504 метров\r\n" +
                "Стоимость материалов необходимых для строительства ограды бассейна и дорожки составляет: 87964.5943005142 рублей\n" +
                "Стоимость материалов необходимых для строительства бетонной дорожки вокруг бассейна составляет: 21991.14857512855 рублей\r\n");
        assertEquals(str, outStream.toString());
    }
}