import org.junit.Test;

import static org.junit.Assert.*;



public class TestNumeric {

@Test
    public void getRadius(){
    Circle circle = new Circle(0,10,0);
   assertEquals(1.591549430918953,circle.getRadius(),0.01);
}
    @Test
    public void getFerence(){
        Circle circle1 = new Circle(5,0,0);
        assertEquals(31.41592653589793,circle1.getFerence(),0.01);
    }

    @Test
    public void getArea(){
        Circle circle2 = new Circle(5,0,0);
        assertEquals(78.53981633974483,circle2.getArea(),0.01);
    }

    @Test
    public void main(){
        double radEarth = 6378.1;
        double newRadEarth = Numeric.deltaEarth(radEarth);
        double delta = newRadEarth - radEarth;
        assertEquals(0.1591549430922896,delta,0.01);
    }
}
