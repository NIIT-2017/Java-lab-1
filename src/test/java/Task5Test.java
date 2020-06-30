import org.junit.Test;

import static org.junit.Assert.*;

public class Task5Test {

    @Test
    public void buildNum() {
        assertEquals("13579","    *    ***    *****  *****  **** ", Task5.BuildNum("13579",0));
    }
}