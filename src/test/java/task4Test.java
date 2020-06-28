import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task4Test {

    @Test
    void svertka() {
        assertEquals("5,4,1-4,8,5,43-46", task4.svertka("5,4,1,2,3,4,8,5,43,44,45,46"));
    }
}