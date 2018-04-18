import org.junit.Test;

import static org.junit.Assert.*;

public class Task6CircleTest {
   /* тестируем с погрешностью delta: 0.01 */
    @Test
    public void setRadius() {
        Circle testObject = new Circle();
        testObject.setRadius(1.00);
        assertEquals(1.00, testObject.getRadius(), 0.01);
        assertEquals(6.28, testObject.getFerence(), 0.01);
        assertEquals(3.14, testObject.getArea(), 0.01);
    }

    @Test
    public void setFerence() {
        Circle testObject = new Circle();
        testObject.setFerence(10.00);
        assertEquals(10.00, testObject.getFerence(), 0.01);
        assertEquals(1.59, testObject.getRadius(), 0.01);
        assertEquals(7.96, testObject.getArea(), 0.01);
    }

    @Test
    public void setArea() {
        Circle testObject = new Circle();
        testObject.setArea(100.00);
        assertEquals(100.00, testObject.getArea(), 0.01);
        assertEquals(5.64, testObject.getRadius(), 0.01);
        assertEquals(35.45, testObject.getFerence(), 0.01);
    }
}