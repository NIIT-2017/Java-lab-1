import static org.junit.Assert.*;

public class TestCircle {
    @org.junit.Test
    public void setRadius() {
        Circle circle = new Circle();
        circle.setRadius(10);
        assertEquals(314.16, circle.getArea(),0.01);
    }

    @org.junit.Test
    public void setFerence() {
        Circle circle = new Circle();
        circle.setFerence(100);
        assertEquals(15.92, circle.getRadius(), 0.01);
    }

    @org.junit.Test
    public void setArea() {
        Circle circle = new Circle();
        circle.setArea(100);
        assertEquals(5.64, circle.getRadius(), 0.01);
    }
}