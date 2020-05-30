import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask6 {

    @Test
    public void getRadius() {
        circle testCircle = new circle();
        testCircle.setFerence(20);
        assertEquals(3.183098861837907, testCircle.getRadius(), 0.1);
    }

}
