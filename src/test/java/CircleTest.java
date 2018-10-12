import niit.lab1.task6.Circle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CircleTest {
    @Test
    public void changingRadius() {
        Circle circle = new Circle(0,0,0);
        circle.setRadius(1);
        assertTrue(circle.getRadius() > 0);
        assertTrue(circle.getFerence() > 0);
        assertTrue(circle.getArea() > 0);
    }
    @Test
    public void changingFence() {
        Circle circle = new Circle(0,0,0);
        circle.setFerence(1);
        assertTrue(circle.getRadius() > 0);
        assertTrue(circle.getFerence() > 0);
        assertTrue(circle.getArea() > 0);
    }
    @Test
    public void changingArea() {
        Circle circle = new Circle(0,0,0);
        circle.setArea(1);
        assertTrue(circle.getRadius() > 0);
        assertTrue(circle.getFerence() > 0);
        assertTrue(circle.getArea() > 0);
    }
}
