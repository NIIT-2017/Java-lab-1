import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import HomeworkLab1.*;
import static org.junit.jupiter.api.Assertions.*;

class Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void func() throws Exception {
        assertEquals(524,Task1.func());
        assertEquals(2,Task2.sqrt(4,0.1));
        assertEquals("1,2,4,5,6,7,18,19,20,21",Task3.sequence("1,2,4-7,18-21"));
        assertEquals("1,2,4-7,18-21",Task4.convolve("1,2,4,5,6,7,18,19,20,21"));
        assertEquals("*  *****  \n" +
                "   **     *   \n" +
                "  * *    *    \n" +
                " *  *  *      \n" +
                "    *  *****",Task5.print("12"));
        assertEquals(1.5915494259388652E-4,Task6.main());
        assertEquals(72256.63103256523,Task7.func());
    }
}