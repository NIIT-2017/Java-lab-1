import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditorTest {

    @Test
    void expandStr() {
        assertEquals("1,2,4,5,6,7", Editor.ExpandStr("1,2,4-7"));
        assertEquals("1,2,3,4,10,12,13,14,15,20", Editor.ExpandStr("1-4,10,12-15,20"));
        assertEquals("1,2,4,5,6,7,18,19,20,21", Editor.ExpandStr("1,2,4-7,18-21"));
        assertEquals("1,2,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,23,45,46,47,48,49", Editor.ExpandStr("   1, 2   ,5   -19,  \n 23,45-  49   ,"));
        assertEquals("15", Editor.ExpandStr("15"));
    }
}