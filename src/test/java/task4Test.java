import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class task4Test {

    @Test
    public void parseString() {
        Assert.assertEquals("", task4.parseString(""));
        Assert.assertEquals("1,2,4-7,18-21", task4.parseString("1,2,4,5,6,7,18,19,20,21"));
        Assert.assertEquals("1-12", task4.parseString("1,2,3,4,5,6,7,8,9,10,11,12"));
        Assert.assertEquals("1,2", task4.parseString("1,2"));
        Assert.assertEquals("10", task4.parseString("10"));
    }
}