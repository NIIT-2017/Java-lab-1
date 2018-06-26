package Collatz;

import static org.junit.Assert.*;

public class CollatzStartTest {

    @org.junit.Test
    public void collatz() {
        assertEquals(525, new CollatzStart().collatz(837799));
    }
}