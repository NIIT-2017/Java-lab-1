import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class TestDeploy {

    @Test
    public void main(){
          String s= "1,3,5-8,10,12-15";
            List<Integer> list = DeployNumber.res(s);
            List<Integer> list_1 = Arrays.asList(1,3,5,6,7,8,10,12,13,14,15);
            assertEquals(list_1,list);
    }
}
