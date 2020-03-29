import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class task3Test {

    @Test
    public void parseString() {
        Assert.assertEquals("1,2,4,5,6,7,18,19,20,21", task3.parseString("1,2,4-7,18-21"));
        Assert.assertEquals("1,2,3,4,5,6,7,8,9,10,11,12", task3.parseString("1-12"));
        Assert.assertEquals("10", task3.parseString("10"));
        Assert.assertEquals("", task3.parseString(""));
        Assert.assertEquals("1,2", task3.parseString("1,2"));
    }
}