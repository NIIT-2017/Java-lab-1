import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleDemoTest {

    @Test
    public void setRadius() {
        CircleDemo circle = new CircleDemo();
        circle.setRadius(6378.1);
        Double cArea = circle.getArea();
        boolean eqArea = cArea.equals(1.2780049057763624E8);
        Assert.assertEquals(true, eqArea);
        Double cFerence = circle.getFerence();
        boolean eqFerence = cFerence.equals(40074.78420772212);
        Assert.assertEquals(true, eqFerence);
    }

    @Test
    public void setFerence() {
        CircleDemo circle = new CircleDemo();
        circle.setFerence(40074.78420772212);
        Double cRadius = circle.getRadius();
        boolean eqRadius = cRadius.equals(6378.1);
        Assert.assertEquals(true, eqRadius);
        Double cArea = circle.getArea();
        boolean eqArea = cArea.equals(1.2780049057763624E8);
        Assert.assertEquals(true, eqArea);
    }

    @Test
    public void setArea() {

        CircleDemo circle = new CircleDemo();
        circle.setArea(1.2780049057763624E8);
        Double cRadius = circle.getRadius();
        boolean eqRadius = cRadius.equals(6378.1);
        Assert.assertEquals(true, eqRadius);
        Double cFerence = circle.getFerence();
        boolean eqFerence = cFerence.equals(40074.78420772212);
        Assert.assertEquals(true, eqFerence);

    }
}