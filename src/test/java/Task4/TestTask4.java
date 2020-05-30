import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask4 {

    @Test
    public void convolution() {
        assertEquals("1-3", Task4.convolution("1,2,3"));
        assertEquals("1,3-5", Task4.convolution("1,3,4,5"));
        assertEquals("-1-2", Task4.convolution("-1,0,1,2"));
    }
}