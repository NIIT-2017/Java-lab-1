import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzTest {

       @Test
    public void main() {
        assertEquals(259,Collatz.collatz(999999));
    }
}