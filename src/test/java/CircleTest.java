import org.junit.Test;
import static org.junit.Assert.*;
public class CircleTest
{
    @Test
    public void setRadius()
    {
        Circle circle = new Circle();
        circle.setRadius(6378.1);
        Double cArea = circle.getArea();
        boolean eqArea = cArea.equals(1.2780049057763624E8);
        assertEquals(true, eqArea);
        Double cFerence = circle.getFerence();
        boolean eqFerence = cFerence.equals(40074.78420772212);
        assertEquals(true, eqFerence);
    }
    @Test
    public void setFerence()
    {
        Circle circle = new Circle();
        circle.setFerence(40074.78420772212);
        Double cRadius = circle.getRadius();
        boolean eqRadius = cRadius.equals(6378.1);
        assertEquals(true, eqRadius);
        Double cArea = circle.getArea();
        boolean eqArea = cArea.equals(1.2780049057763624E8);
        assertEquals(true, eqArea);
    }
    @Test
    public void setArea()
    {
        Circle circle = new Circle();
        circle.setArea(1.2780049057763624E8);
        Double cRadius = circle.getRadius();
        boolean eqRadius = cRadius.equals(6378.1);
        assertEquals(true, eqRadius);
        Double cFerence = circle.getFerence();
        boolean eqFerence = cFerence.equals(40074.78420772212);
        assertEquals(true, eqFerence);
    }
}