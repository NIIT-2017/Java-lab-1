import org.junit.Test;

import static org.junit.Assert.*;

public class AssemblyTest {

    @Test
    public void transform() {
        Assembly ass=new Assembly("1,3,4,5,7,9,10,11,12,14,15");
        assertEquals("1,3-5,7,9-12,14,15",ass.transform());
        Assembly ass1=new Assembly("1,3");
        assertEquals("1,3",ass1.transform());
        Assembly ass2=new Assembly("1,2,3");
        assertEquals("1-3",ass2.transform());
    }
}