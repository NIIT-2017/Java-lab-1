import org.junit.Test;
import org.junit.Assert;
import java.util.Objects;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setRadius() {
        Circle eAr = new Circle();
        eAr.setRadius(6378100);
        Double eArArea = eAr.getArea();
        boolean isArea = eArArea.equals(1.2780049057763622E14);
        assertEquals(true, isArea);
        Double eArFerence = eAr.getFerence();
        boolean isFerence = eArFerence.equals(4.007478420772212E7);
        assertEquals(true, isFerence);

    }
    @Test
    public void setFerence() {
        Circle eAr = new Circle();
        eAr.setFerence(4.007478420772212E7);
        Double eArArea = eAr.getArea();
        boolean isArea = eArArea.equals(1.2780049057763622E14);
        assertEquals(true, isArea);
    }
    @Test
    public void setArea() {
        Circle eAr = new Circle();
        eAr.setArea(1.2780049057763622E14);
        Double eArFerence = eAr.getFerence();
        boolean isFerence = eArFerence.equals(4.007478420772212E7);
        assertEquals(true, isFerence);
    }
}
