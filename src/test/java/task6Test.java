import org.junit.Test;
import static org.junit.Assert.*;

public class task6Test {

    @Test
    public void earthTask() {
        assertEquals(6.378100052475929, task6.earthTask(6378.1, 0.001), 0.000000001);
    }

    @Test
    public void poolTask() {
        assertEquals(72256.63103256523, task6.poolTask(1000,2000,3,1), 0.000000001);
    }
}