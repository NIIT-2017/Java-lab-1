import org.junit.Test;

import static org.junit.Assert.*;

public class CollapseTest extends Collapse{

    @Test
    public void collapseTest() {
        assertEquals("1-4,8,10-14,20,22,25,28", collapse("1,2,3,4,8,10,11,12,13,14,20,22,25,28"));
    }
}