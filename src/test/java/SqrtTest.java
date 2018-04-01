import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kortez on 26.03.18.
 */
public class SqrtTest {
    @Test
    public void average() throws Exception {
        Sqrt sqrt = new Sqrt();
        assertEquals("15.0",Double.toString(sqrt.average(10,20)));
    }

    @Test
    public void good() throws Exception {
        Sqrt sqrt = new Sqrt(0.0,0.001);
        assertEquals(true,sqrt.good(5,25.0001));
    }
    @Test
    public void not_good() throws Exception {
        Sqrt sqrt = new Sqrt(0.0,0.001);
        assertEquals(false,sqrt.good(5,25.001));
    }

    @Test
    public void improve() throws Exception {
        Sqrt sqrt = new Sqrt();
        assertEquals("3.0", Double.toString(sqrt.improve(2.0,8.0)));
    }

    @Test
    public void iter() throws Exception {
        Sqrt sqrt = new Sqrt(5.0,0.001);
        assert(2.23-sqrt.iter(1.0,5.0)<sqrt.delta);
    }

    @Test
    public void calc() throws Exception {
        Sqrt sqrt = new Sqrt(5,0.01);
        assert(Math.abs(2.23-sqrt.calc()) < sqrt.delta);
    }

}