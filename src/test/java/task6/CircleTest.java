package task6;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void getRadius() {
        Circle test = new Circle();
        test.setFerence(20);
        assertEquals(3.183098861837907, test.getRadius(), 0);
    }
}