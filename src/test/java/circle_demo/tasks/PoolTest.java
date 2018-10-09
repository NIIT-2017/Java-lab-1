package circle_demo.tasks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PoolTest {

    Pool pool = new Pool();

    @Test
    public void countTrackPrice() throws Exception {
        double rez = pool.countTrackPrice(1, 1, 1000);
        Assert.assertEquals(9424.78, rez, 0.01);
    }

    @Test
    public void countFencePrice() throws Exception {
        double rez = pool.countFencePrice(1, 1000);
        Assert.assertEquals(6283.19, rez, 0.01);
    }

}