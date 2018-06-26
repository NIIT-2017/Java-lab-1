package SqrtProg;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void setRound() {
        double d = 100000.0;
        assertEquals(d, new Program().setRound(5), 1);
    }
}