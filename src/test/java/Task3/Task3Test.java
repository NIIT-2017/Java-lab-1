import org.junit.Test;
import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void sequence() {

        assertArrayEquals(new int[]{7},Task3.sequence("7"));
        assertArrayEquals(new int[]{6,7,8},Task3.sequence("6-8"));
        assertArrayEquals(new int[]{17,18,19,20,21,22},Task3.sequence("17-22"));

    }
}