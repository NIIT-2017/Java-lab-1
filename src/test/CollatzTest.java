import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzTest {
    @Test
    void setMaxSequence(){
        Collatz collatz = new Collatz();
        assertEquals(949,collatz.setMaxSequence(63728127));
    }
    @Test
    void getResult_number(){
        Collatz collatz = new Collatz();
        collatz.setMaxSequence(837799);
        assertEquals(837799,collatz.getResult_number());
    }
}
