import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class Task5Test {

    @Test
    public void numbersByStars() {
        assertEquals("**** ", Task5.numbersByStars("5", 3));
    }
}