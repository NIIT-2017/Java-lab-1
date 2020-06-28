import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void setRadius() {
        Circle testRadius = new Circle(6378.1);
        testRadius.setRadius(10.0);
        assertEquals(10, testRadius.getRadius());
        assertEquals(62.831853, testRadius.getFerence(),0.01);
        assertEquals(314.159265359, testRadius.getArea(),0.01);
    }

    @Test
    void setFerence() {
        Circle testFerence = new Circle(5);
        testFerence.setFerence(94.2477796);
        assertEquals(94.2477796, testFerence.getFerence(),0.01);
        assertEquals(15, testFerence.getRadius(),0.01);
        assertEquals(706.858347058, testFerence.getArea(),0.01);
    }

    @Test
    void setArea() {
        Circle testArea = new Circle(5);
        testArea.setArea(78.5398163397);
        assertEquals(78.5398163397, testArea.getArea(),0.01);
        assertEquals(5, testArea.getRadius(),0.01);
        assertEquals(31.4159265359, testArea.getFerence(),0.01);
    }
}