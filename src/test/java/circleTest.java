import org.junit.Test;

import static org.junit.Assert.*;

public class circleTest {

    @Test
    public void getRadius() {
        circle testCircle = new circle();
        testCircle.setFerence(30);
        assertEquals(4.7746482927568605, testCircle.getRadius(), 0.1);
    }
}