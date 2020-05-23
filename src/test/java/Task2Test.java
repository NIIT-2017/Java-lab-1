//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {

    Task2 task2Test = new Task2(0.01,5.0);

    @org.junit.Test
    public void checkAverage() {
        assertEquals(3.0, task2Test.average(1.0,5.0));
    }

    @org.junit.Test
    public void checkGoodPozitiv() {
        assertTrue(task2Test.good(2.238095238095238,5.0)==true);
    }

    @org.junit.Test
    public void checkGoodNegativ() {
        assertTrue(task2Test.good(1.0,5.0)==false);
    }

    @org.junit.Test
   public void checkImprove() {
    assertEquals(3.0, task2Test.improve(1.0,5.0));
    }

    @org.junit.Test
    public void checkIter() {
        assertEquals(2.238095238095238, task2Test.iter(2.238095238095238,5.0));
    }

    @org.junit.Test
   public void checkCalc() {
        assertEquals(2.238095238095238, task2Test.calc());
    }
}