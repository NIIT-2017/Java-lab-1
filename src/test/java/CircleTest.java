import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest extends Circle{

    @Test
    public void radiusTest() {
        Circle letsTry = new Circle();
        long rad = 12;
        letsTry.setRadius(rad);

        assertEquals("getRadius", rad, letsTry.getRadius(), 0.001);
        assertEquals("getFerence", 75.398, letsTry.getFerence(), 0.001);
        assertEquals("getArea", 452.389, letsTry.getArea(), 0.001);
    }

    @Test
    public void areaTest() {
        Circle letsTry = new Circle();
        long area = 12;
        letsTry.setArea(area);

        assertEquals("getRadius", 1.954, letsTry.getRadius(), 0.001);
        assertEquals("getFerence", 12.279, letsTry.getFerence(), 0.001);
        assertEquals("getArea", 12.0, letsTry.getArea(), 0.001);
    }

    @Test
    public void ferenceTest() {
        Circle letsTry = new Circle();
        long ference = 12;
        letsTry.setFerence(ference);

        assertEquals("getRadius", 1.909, letsTry.getRadius(), 0.001);
        assertEquals("getFerence", 12.0, letsTry.getFerence(), 0.001);
        assertEquals("getArea", 11.459, letsTry.getArea(), 0.001);
    }
}