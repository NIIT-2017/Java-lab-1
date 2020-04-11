import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.AfterTest;
import static org.junit.Assert.*;
public class L1T4Test
{
    @Test
    public void parseString()
    {
        Assert.assertEquals("0,4-8,16-20,100", L1T4.zoom("0,4,5,6,7,8,16,17,18,19,20,100"));
    }
}