import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Collatz_test {
    @Test
    public void main() {
       assertEquals(1, Collatz.metodCollatz(1));
        assertEquals(525, Collatz.metodCollatz(837799));
        assertEquals(21, Collatz.metodCollatz(19));
        assertEquals(112, Collatz.metodCollatz(27));
        assertEquals(179, Collatz.metodCollatz(871));
    }

}
