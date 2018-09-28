import org.junit.Test;

import static org.junit.Assert.*;

public class task1Test {

    @Test (timeout = 3000)
    public void collatz() {
        task1.Collatz(837799);
    }
}