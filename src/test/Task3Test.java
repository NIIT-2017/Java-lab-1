import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void deploymnet() {
        Task3 testDeployment = new Task3();
        assertEquals("1,2,4,5,6,7,18,19,20,21", testDeployment.deploymnet("1,2,4-7,18-21"));
    }
}