import org.junit.Test;

import static org.junit.Assert.*;

public class Chisla3Test {

    @Test
    public void resultString() {
        assertEquals("13579","    *    ***    *****  *****  **** ",Chisla3.resultString("13579",0));
    }
}