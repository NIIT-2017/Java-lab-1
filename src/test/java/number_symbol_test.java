import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class number_symbol_test {
    @Test
    public void main() {
        assertEquals(1, Collatz.metodCollatz(1));
        assertEquals(525, Collatz.metodCollatz(837799));
    }
}
