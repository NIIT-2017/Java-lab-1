import org.junit.Test;

import static org.junit.Assert.*;

public class Task2SqrtTest {

    public Sqrt objectTest = new Sqrt(255, 0.001);

    @Test
    public void average() {
        assertEquals(1.25, objectTest.average(1.00, 1.5), 0.001);
        assertNotEquals(1.24, objectTest.average(1.00, 1.5),0.001);
        assertNotEquals(1.26, objectTest.average(1.00, 1.5),0.001);
    }

    @Test
    public void good() {
        assertTrue(objectTest.good(1.5, 2.25));
        assertFalse(objectTest.good(1.5, 2.24));
        assertFalse(objectTest.good(1.5, 2.26));
    }

    @Test
    public void improve() {
        assertEquals(1.458, objectTest.improve(2.25, 1.5), 0.001);
        assertNotEquals(1.457, objectTest.improve(2.25, 1.5), 0.001);
        // assertNotEquals(1.459, object.improve(2.25, 1.5), 0.001); // vozvrashaet oshibku
    }

    @Test
    public void iter() {
        assertEquals(1.414, objectTest.iter(1, 2), 0.001);
        assertNotEquals(1.413, objectTest.iter(1, 2), 0.001);
    }

    @Test
    public void calc() {
        assertEquals(15.968, objectTest.calc(), 0.001);
        assertNotEquals(15.967, objectTest.calc(), 0.001);
    }
}