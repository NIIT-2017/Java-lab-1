package circle_demo.circle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    private Circle circle;

    @Before
    public void init(){
        circle = new Circle();
    }
    @Test
    public void countCircumference() throws Exception {
        double rez = circle.countCircumference(3);
        Assert.assertEquals(18.849, rez, 0.001);
    }

    @Test
    public void countArea() throws Exception {
        double rez = circle.countArea(3);
        Assert.assertEquals(28.274, rez, 0.001);
    }

    @Test
    public void countRadiusFromArea() throws Exception {
        double rez = circle.countRadiusFromArea(28.274);
        Assert.assertEquals(3, rez, 0.001);
    }

    @Test
    public void countRadiusFromCircumference() throws Exception {
        double rez = circle.countRadiusFromCircumference(18.845);
        Assert.assertEquals(3, rez, 0.001);
    }

}