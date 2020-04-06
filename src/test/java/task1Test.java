import static org.junit.jupiter.api.Assertions.*;

class task1Test {

    @org.junit.jupiter.api.Test
    void seqCollatz() {
        assertEquals(525,task1.seqCollatz());
    }

    @org.junit.jupiter.api.Test
    void collatz() {
        assertEquals(525, task1.collatz(837799));
    }
}