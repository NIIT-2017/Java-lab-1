import org.junit.Test;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

public class Lab1Task6Test {

    @Test
    public void main1() {
        DecimalFormat df1 = new DecimalFormat("#0.000");
        KnotAroundEarth knot = new KnotAroundEarth();
        assertEquals("0.318",
                df1.format(knot.getDelta_diameter(6378.1, 1.0 / 1000) * 1000));
    }
    @Test
    public void main2() {
        DecimalFormat df1 = new DecimalFormat("#0.00");
        SwimmingPool pool = new SwimmingPool();
        assertEquals("21991.15",
                df1.format(pool.getWalkway_cost(3, 1, 1000)));
        assertEquals("50265.48",
                df1.format(pool.getFence_cost(3, 1, 2000)));
    }
}
