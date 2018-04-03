import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setRadius() {
        Circle c1=new Circle();
        c1.setRadius(3.0);
        assertEquals(18.84,c1.getFerence(),0.01);
        assertEquals(28.27,c1.getArea(),0.01);
        assertEquals(3.0,c1.getRadius(),0.01);
    }

    @Test
    public void setFerence() {
        Circle c1=new Circle();
        c1.setFerence(18.84);
        assertEquals(18.84,c1.getFerence(),0.01);
        assertEquals(28.27,c1.getArea(),0.03);
        assertEquals(3.0,c1.getRadius(),0.01);
    }

    @Test
    public void setArea() {
        Circle c1=new Circle();
        c1.setArea(28.27);
        assertEquals(18.84,c1.getFerence(),0.01);
        assertEquals(28.27,c1.getArea(),0.03);
        assertEquals(3.0,c1.getRadius(),0.01);
    }
}