import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setRadius() {
        Circle circle = new Circle();
        circle.setRadius(3);
        assertEquals(18.85, circle.getFerence(), 0.02);
    }

    @Test
    public void setFerence() {
        Circle circle = new Circle();
        circle.setFerence(18.85);
        assertEquals(3, circle.getRadius(), 0.01);
    }

    @Test
    public void setArea() {
        Circle circle = new Circle();
        circle.setArea(50.24);
        assertEquals(4.0, circle.getRadius(), 0.000001);
    }

}