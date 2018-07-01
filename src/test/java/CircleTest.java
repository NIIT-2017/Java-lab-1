import static org.junit.Assert.*;

public class CircleTest {

    @org.junit.Test
    public void setRadius() {
        Circle test = new Circle();
        test.setRadius(15.5);
        assertEquals(754.385, test.getArea(), 0.0001);
        assertEquals(97.34, test.getFerence(), 0.01);

    }

    @org.junit.Test
    public void setFerence() {
        Circle test = new Circle();
        test.setFerence(11.4);
        assertEquals(1.815, test.getRadius(), 0.001);
        assertEquals(10.34, test.getArea(), 0.01);
    }

    @org.junit.Test
    public void setArea() {
        Circle test = new Circle();
        test.setArea(106.8);
        assertEquals(5.832, test.getRadius(), 0.001);
        assertEquals(36.62, test.getFerence(), 0.01);
    }
}