import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setRadius() {
        Circle circle = new Circle();
        circle.SetRadius(10.0);
        assertEquals(62.83185307, circle.GetFerence(), 0.00001);
        assertEquals(314.1592654, circle.GetArea(), 0.00001);
    }

    @Test
    public void setFerence() {
        Circle circle = new Circle();
        circle.SetFerence(62.8318530717959);
        assertEquals(10.0, circle.GetRadius(), 0.00001);
        assertEquals(314.1592654, circle.GetArea(), 0.00001);
    }

    @Test
    public void setArea() {
        Circle circle = new Circle();
        circle.SetArea(314.159265358979);
        assertEquals(62.83185307, circle.GetFerence(), 0.00001);
        assertEquals(10.0, circle.GetRadius(), 0.00001);
    }
}