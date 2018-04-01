import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by khvostovai on 27.03.2018.
 */
public class CircleDemoTest {
    CircleDemo circleDemo = new CircleDemo(1.0);
    @Test
    public void getRadius() throws Exception {
        assertEquals("1.0",Double.toString(circleDemo.getRadius()));
    }

    @Test
    public void getFerence() throws Exception {
        double ference = circleDemo.getRadius()*2*Math.PI;
        assertEquals(Double.toString(ference),Double.toString(circleDemo.getFerence()));
    }

    @Test
    public void getArea() throws Exception {
        double area = Math.PI*circleDemo.getRadius()*circleDemo.getRadius();
        assertEquals(Double.toString(area),Double.toString(circleDemo.getArea()));
    }

    @Test
    public void setRadius() throws Exception {
        circleDemo.setRadius(2.0);
        double area=Math.PI*2.0*2.0;
        double ference = 2*Math.PI*2.0;
        assertEquals(Double.toString(area),Double.toString(circleDemo.getArea()));
        assertEquals(Double.toString(ference),Double.toString(circleDemo.getFerence()));
    }

    @Test
    public void setFerence() throws Exception {
        circleDemo.setFerence(2.0);
        double radius = 2.0/(Math.PI*2);
        double area   = radius*radius*Math.PI;
        assertEquals(Double.toString(radius),Double.toString(circleDemo.getRadius()));
        assertEquals(Double.toString(area),Double.toString(circleDemo.getArea()));
    }

    @Test
    public void setArea() throws Exception {
        circleDemo.setArea(2.0);
        double radius = Math.sqrt(2.0/Math.PI);
        double ference = 2*Math.PI*radius;
        assertEquals(Double.toString(radius),Double.toString(circleDemo.getRadius()));
        assertEquals(Double.toString(ference),Double.toString(circleDemo.getFerence()));
    }

}