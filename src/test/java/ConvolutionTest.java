import org.junit.Test;
import static org.junit.Assert.*;

public class ConvolutionTest {

    @Test
    public void main(){
           String s= "1,3,4,5,6,8,10,12,13,14,15";
        String Result = ConvolutionNumber.res(s);
        String Result_1 = "1,3-6,8,10,12-15";
        assertEquals(Result_1,Result);
    }
}
