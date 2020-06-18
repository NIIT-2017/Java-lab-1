import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void calc() {
        Sqrt test = new Sqrt(25,0.1);
        assertEquals(25,test.calc(), 0.1);

    }
}