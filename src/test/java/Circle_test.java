import org.junit.Test;

import static org.junit.Assert.*;

public class Circle_test {

    @Test
    public void getRadius() {
        Circle test = new Circle();
        test.setFerence(36);
        assertEquals(5.729577951308232, test.getRadius(), 0);
    }
}