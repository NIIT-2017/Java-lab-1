import static org.junit.Assert.*;

public class SqrtTest {
    Sqrt sqrtTest=new Sqrt(10,0.15);

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void average() {
        assertEquals(3.15,sqrtTest.average(3.15,3.17),0.1);
    }

    @org.junit.Test
    public void good() {
       boolean res=Math.abs(3*3-3.15)<0.15;
       assertFalse(res);
    }

    @org.junit.Test
    public void improve() {
        assertEquals(2.025,sqrtTest.improve(3,3.15),0.15);
    }

    @org.junit.Test
    public void iter() {
        assertEquals(1.79,sqrtTest.iter(3,3.15),0.15);

    }

    @org.junit.Test
    public void calc() {
        assertEquals(1.79, sqrtTest.iter(3,3.15),0.15);
    }
}