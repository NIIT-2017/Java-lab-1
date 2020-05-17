import static org.junit.Assert.*;
public class L1T2v2Test
{
    @org.junit.Test
    public void main()
    {
        Sqrt sqrt=new Sqrt(1,1);
        Double result=sqrt.calc();
        assertEquals(true, result.equals(1.0));
    }
}