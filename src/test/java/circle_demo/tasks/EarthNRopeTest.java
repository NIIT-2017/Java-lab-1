package circle_demo.tasks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EarthNRopeTest {

    EarthNRope earthNRope = new EarthNRope();

    @Test
    public void countGap() throws Exception {

        double rez = earthNRope.countGap(0.001);
        Assert.assertEquals(0.159e-4, rez, 0.001);
    }

    @Test(expected = NumberFormatException.class)
    public void negativeDeltaCountGap(){
        earthNRope.countGap(-0.001);
    }
}