package range_pack;

import org.junit.Assert;

public class RangePackTest {
    @org.junit.Test
    public void createString() throws Exception {
        RangePack rangePack = new RangePack();
        String res = rangePack.createString(new String[]{"1,2,3,5,6,7,9"});
        Assert.assertEquals("1-3,5-7,9", res);
    }
}