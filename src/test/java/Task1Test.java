import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void collatc() {
        assertEquals(19, Task1.Collatc(30));
        assertEquals(21, Task1.Collatc(19));
    }
}