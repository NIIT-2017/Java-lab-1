import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setRad() {
        Circle circle = new Circle();
        circle.setRad(3);
        assertEquals(18.849, circle.getFer(),0.001);
    }

    @Test
    public void setFer() {
        Circle circle = new Circle();
        circle.setFer(20);
        assertEquals(31.83, circle.getAr(),0.01);
    }

    @Test
    public void setAr() {
        Circle circle = new Circle();
        circle.setAr(3.1415);
        assertEquals(1, circle.getRad(),0.0001);
    }
}