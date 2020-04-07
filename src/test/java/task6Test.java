import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task6Test {

    @Test
    void earthTask() {
        assertEquals(6.378100052475929, task6.earthTask(6378.1, 0.001));
    }

    @Test
    void poolTask() {
        assertEquals(72256.63103256523, task6.poolTask(1000,2000,3,1));
    }
}