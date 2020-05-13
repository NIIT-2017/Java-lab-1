//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class RedactorTest {

    @Test
    public void collapseStr() {
        assertEquals("1,2,4-7", Redactor.CollapseStr("1,2,4,5,6,7"));
        assertEquals("1-4,10,12-15,20", Redactor.CollapseStr("1,2,3,4,10,12,13,14,15,20"));
        assertEquals("1,2,4-7,18-21", Redactor.CollapseStr("1,2,4,5,6,7,18,19,20,21"));
        assertEquals("1-5,19,23,45,46,49", Redactor.CollapseStr("   1, 2,3,    4,   5   ,19,  \n 23,45,    46,  49   ,"));
        assertEquals("15", Redactor.CollapseStr("15"));
    }
}