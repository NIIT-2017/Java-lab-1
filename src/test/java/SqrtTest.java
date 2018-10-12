import niit.lab1.task2.Program;
import niit.lab1.task2.Sqrt;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SqrtTest {
    @Test
    public void evaluateSqrt(){
        Sqrt sqrt = new Sqrt(16,0.001);
        double result=sqrt.calc();
        assertEquals(4.0d,result,0.1);

    }

}
