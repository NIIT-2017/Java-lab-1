import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @org.junit.jupiter.api.Test
    void seqCollatz() {
        assertEquals(837799, Task1.seqCollatz());
    }

    @org.junit.jupiter.api.Test
    void collatz() {
        assertEquals(525, Task1.collatz(837799));
    }
}