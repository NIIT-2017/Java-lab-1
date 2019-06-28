import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setRadius() {
        Circle circle = new Circle();
        circle.setFerence(1000);
        assertEquals(159, circle.getRadius(), 1);
    }


    @Test
    public void setFerence() {
        Circle circle = new Circle();
        circle.setRadius(300);
        assertEquals(1884, circle.getFerence(), 1);
    }

    @Test
    public void setArea() {
        Circle circle = new Circle();
        circle.setArea(314);
        assertEquals(10,circle.getRadius(),0.01);
    }
}
