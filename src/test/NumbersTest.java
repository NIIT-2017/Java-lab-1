import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    Numbers numbers = new Numbers();
    String [] args ={"1","2","3","4","5","-","20"};
    @Test
    void wrapping() {

        assertEquals("[6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]",numbers.wrapping(args));
    }

    @Test
    void delete() {
        assertEquals("[1, 2, 3, 4, 5]",numbers.delete(args));
    }

    @Test
    void addingString() {
        assertEquals("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ",numbers.addingString(args));
    }
}
