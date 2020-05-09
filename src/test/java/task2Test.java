import static org.junit.jupiter.api.Assertions.*;

class task2Test {

    @org.junit.jupiter.api.Test
    void calc() {
        task2 sqrtSubject1 = new task2(1,0.1);
        assertEquals(1.0, sqrtSubject1.calc());
        task2 sqrtSubject2 = new task2(4,0.1);
        assertEquals(2.0, sqrtSubject2.calc(), 0.1);
        task2 sqrtSubject3 = new task2(9,0.1);
        assertEquals(3.0, sqrtSubject3.calc(),0.1);
        task2 sqrtSubject4 = new task2(2,0.000000000001);
        assertEquals(1.414213562373095, sqrtSubject4.calc());
    }
}