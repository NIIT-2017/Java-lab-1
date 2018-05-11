import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setRadius() {
        Circle circle = new Circle();
        circle.setRadius(5);
        assertEquals(5.0, circle.getRadius(), 0.001);
        assertEquals(31.415, circle.getFerence(), 0.001);
        assertEquals(78.539, circle.getArea(), 0.001);
    }

    @Test
    public void setFerence() {
        Circle circle = new Circle();
        circle.setFerence(31.415);
        assertEquals(31.415, circle.getFerence(), 0.001);
        assertEquals(5.000, circle.getRadius(), 0.001);
        assertEquals(78.535, circle.getArea(), 0.001);
    }

    @Test
    public void setArea() {
        Circle circle = new Circle();
        circle.setArea(78.539);
        assertEquals(78.539, circle.getArea(), 0.001);
        assertEquals(31.415, circle.getFerence(), 0.001);
        assertEquals(5.000, circle.getRadius(), 0.001);
    }
}