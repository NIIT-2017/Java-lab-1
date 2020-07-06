import org.junit.Test;

import static org.junit.Assert.*;

    public class TestTask2 {

        @Test
        public void calc() {
            Sqrt sqrtSubject1 = new Sqrt(1,0.1);
            assertEquals(1.0, sqrtSubject1.calc(), 0.1);
            Sqrt sqrtSubject2 = new Sqrt(4,0.1);
            assertEquals(2.0, sqrtSubject2.calc(), 0.1);
            Sqrt sqrtSubject3 = new Sqrt(9,0.1);
            assertEquals(3.0, sqrtSubject3.calc(),0.1);
            }
    }

