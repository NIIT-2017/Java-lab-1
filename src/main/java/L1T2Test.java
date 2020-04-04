import org.junit.Assert;
import org.junit.jupiter.api.Test;
class L1T2Test
{
    @Test
    void main()
    {
        Sqrt sqrt=new Sqrt(1,1);
        Double result=sqrt.calc();
        Assert.assertEquals(true, result.equals(1.0));
    }
}
