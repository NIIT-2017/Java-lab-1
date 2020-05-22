import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class Task4Test {

    @Test
    public void closed() {
        assertEquals("1-5,8,11-14,18,20,26-29", Task4.closed("1,2,3,4,5,8,11,12,13,14,18,20,26,27,28,29"));
    }
}