import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setRadius() {
        Circle circle1   = new Circle();
        circle1.setRadius(3);
        assertEquals(18.84,circle1.getFerence(),0.01);
    }

    @Test
    public void setFerence() {
        Circle circle2   = new Circle();
        circle2.setFerence(6.28);
        assertEquals(3.14,circle2.getArea(),0.01);
    }

    @Test
    public void setArea() {
        Circle circle3   = new Circle();
        circle3.setArea(43.2);
        assertEquals(3.70, circle3.getRadius(), 0.01);
    }
}