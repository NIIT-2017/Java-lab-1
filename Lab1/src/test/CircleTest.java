import org.junit.*;

import static org.junit.Assert.*;


public class CircleTest {

   Circle circle=new Circle(1,6.28,3.14);

    @Test
    public void setRadius() {
        circle.setFerence(6.28);
        circle.setRadius(1);
        circle.setArea(3.14);
    }

    @Test
    public void getRadius() {
        assertEquals(1,6.28/(2*Math.PI),0.1);
    }

    @Test
    public void setFerence() {
        circle.setRadius(1);
        circle.setArea(3.14);
        circle.setFerence(6.28);
    }

    @Test
    public void getFerence() {
        assertEquals(6.28,2*Math.PI*circle.getRadius(),0.1);
    }

    @Test
    public void setArea() {
        circle.setRadius(1);
        circle.setFerence(6.28);
        circle.setArea(3.14);
    }

    @Test
    public void getArea() {
        assertEquals(3.14, Math.pow(circle.getRadius(),2)*Math.PI,0.1);
    }
}