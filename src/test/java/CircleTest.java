import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void setRadius() {
        Circle circle = new Circle();
        circle.setRadius(10.00);
        Double compareArea = circle.getArea();
        boolean equalArea = compareArea.equals(Math.PI*100.00);
        assertTrue(equalArea);
        Double compareFerence = circle.getFerence();
        boolean equalFerence = compareFerence.equals(Math.PI*20.00);
        assertTrue(equalFerence);
    }

    @Test
    void setFerence() {
        Circle circle = new Circle();
        circle.setFerence(Math.PI*20.00);
        Double compareArea = circle.getArea();
        boolean equalArea = compareArea.equals(Math.PI*100.00);
        assertTrue(equalArea);
        Double compareRadius = circle.getRadius();
        boolean equalRadius = compareRadius.equals(10.00);
        assertTrue(equalRadius);
    }

    @Test
    void setArea() {
        Circle circle = new Circle();
        circle.setArea(Math.PI*100.00);
        Double compareRadius = circle.getRadius();
        boolean equalRadius = compareRadius.equals(10.00);
        assertTrue(equalRadius);
        Double compareFerence = circle.getFerence();
        boolean equalFerence = compareFerence.equals(Math.PI*20.00);
        assertTrue(equalFerence);
    }
}