package range_scan;

import org.junit.Assert;
import org.junit.Test;

public class RangeScanTest {
    @Test
    public void createSequence() throws Exception {
        RangeScan rangeScan = new RangeScan();
        String res = rangeScan.createSequence(new String[]{"1,2,3-5"});
        Assert.assertEquals("1,2,3,4,5", res);

    }
}

