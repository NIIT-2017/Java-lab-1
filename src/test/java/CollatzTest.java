//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class CollatzTest {

    @Test
    public void findLongestSequence() {
        Collatz col = new Collatz();
        col.findLongestSequence(1000000);
        assertEquals(525, col.getLongest());
    }
}