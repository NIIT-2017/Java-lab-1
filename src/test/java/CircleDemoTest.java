import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CircleDemoTest
{
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
    public void exercise1_1() {
        CircleDemo.exercise1(1,0.001);
        assertEquals("Зазор равен 15.92 сантиметров. ", outStream.toString());
    }
    @Test
    public void exercise1_100() {
        CircleDemo.exercise1(100,0.001);
        assertEquals("Зазор равен 15.92 сантиметров. ", outStream.toString());
    }
    @Test
    public void exercise1_1000() {
        CircleDemo.exercise1(1000,0.001);
        assertEquals("Зазор равен 15.92 сантиметров. ", outStream.toString());
    }

    @Test
    public void exercise1_1000_001() {
        CircleDemo.exercise1(1000,0.01);
        assertEquals("Зазор равен 159.16 сантиметров. ", outStream.toString());
    }
    @Test
    public void exercise1_1000_01() {
        CircleDemo.exercise1(1000,0.1);
        assertEquals("Зазор равен 1591.55 сантиметров. ", outStream.toString());
    }

    @Test
    public void exercise1_6378_01() {
        CircleDemo.exercise1(6378.1,0.1);
        assertEquals("Зазор равен 1591.55 сантиметров. ", outStream.toString());
    }
    @Test
    public void exercise1_6378_001() {
        CircleDemo.exercise1(6378.1,0.01);
        assertEquals("Зазор равен 159.16 сантиметров. ", outStream.toString());
    }

    @Test
    public void exercise1() {
        CircleDemo.exercise1(6378.1,0.001);
        assertEquals("Зазор равен 15.92 сантиметров. ", outStream.toString());
    }

    @Test
    public void exercise2() {
        CircleDemo.exercise2(3,1,1000,2000);
        assertEquals("Стоимость дорожки и ограды равны 21991.13 и 50265.44 рублей.", outStream.toString());
    }
}
