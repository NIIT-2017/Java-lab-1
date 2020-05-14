import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void expand() {
        assertEquals("1, 2, 3, 4, 5, 8, 11, 12, 13, 14, 18, 20, 26, 27, 28, 29", Task3.expand("1-5, 8, 11-14, 18, 20, 26-29"));
    }
}