import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setRadiusAndGet() {
        double accuracy = 0.0000001;
        double radius = 9.0;
        Circle circle = new Circle();
        circle.setRadius(radius);
        assertEquals(radius, circle.getRadius(), accuracy);
        assertEquals(2 * Math.PI * radius, circle.getFerence(), accuracy);
        assertEquals(Math.PI * (radius * radius), circle.getArea(), accuracy);
    }

    @Test
    public void setFerenceAndGet() {
        double accuracy = 0.0000001;
        double ference = 9.0;
        Circle circle = new Circle();
        circle.setFerence(ference);
        assertEquals(ference / (2 * Math.PI), circle.getRadius(), accuracy);
        assertEquals(ference, circle.getFerence(), accuracy);
        assertEquals((ference * ference) / (4 * Math.PI), circle.getArea(), accuracy);
    }

    @Test
    public void setAreaAndGet() {
        double accuracy = 0.0000001;
        double area = 9.0;
        Circle circle = new Circle();
        circle.setArea(area);
        assertEquals(Math.sqrt(area / Math.PI), circle.getRadius(), accuracy);
        assertEquals(circle.getRadius() * 2 * Math.PI, circle.getFerence(), accuracy);
        assertEquals(area, circle.getArea(), accuracy);
    }
}