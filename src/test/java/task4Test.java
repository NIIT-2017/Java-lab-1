import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task4Test {

    @Test
    void svertka() {
        assertEquals("1,2,3,4,5,9,15,24,25,26,27,31,33,34,37,38,39","1-5,9,15,24-27,31,33,34,37-39",task4.svertka("1,2,3,4,5,9,15,24,25,26,27,31,33,34,37,38,39"));
        assertEquals("1,5,7,8,10,11,12,21","1,5,7,8,10-12,21",task4.svertka("1,5,7,8,10,11,12,21"));
    }
}