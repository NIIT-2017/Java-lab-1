import org.junit.Test;

import static org.junit.Assert.*;

public class DisassemblyTest {

    @Test
    public void transform() {
        Disassembly dis1=new Disassembly("1-3,7,9,11,13-15");
        assertEquals("1,2,3,7,9,11,13,14,15",dis1.transform());
        Disassembly dis2=new Disassembly("1");
        assertEquals("1",dis2.transform());
        Disassembly dis3=new Disassembly("");
        assertEquals("",dis3.transform());
    }
}