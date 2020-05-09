import static org.junit.jupiter.api.Assertions.*;

class task1Test {

    @org.junit.jupiter.api.Test
    void testCollatz() {
        assertEquals(1, task1.collatz(1));
        assertEquals(525, task1.collatz(837799));
        assertEquals(21, task1.collatz(19));
        assertEquals(112, task1.collatz(27));
        assertEquals(179, task1.collatz(871));
    }

    @org.junit.jupiter.api.Test
    void testMaxCollatz() {
        assertEquals(837799, task1.maxCollatz(1,1000000));
    }
}