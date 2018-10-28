import org.junit.Test;
import static org.junit.Assert.*;

public class SqrtProgramm {

@Test
    public void calc(){
    Sqrt sqrt = new Sqrt(25, 0.1);
    double result = sqrt.calc();
    assertEquals("5.000023178253949",Double.toString(result));

}

}
