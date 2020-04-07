import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoldingTest {

    @Test
    void toFoldString1() {
        assertEquals("11,12,14-17,28-31", Folding.toFoldString("11,12,14,15,16,17,28,29,30,31"));
    }
    @Test
    void toFoldString2() {
        assertEquals("1000-1003,1200-1203", Folding.toFoldString("1000,1001,1002,1003,1200,1201,1202,1203"));
    }
    @Test
    void toFoldString3() {
        assertEquals("5000001-5000007", Folding.toFoldString("5000001,5000002,5000003,5000004,5000005,5000006,5000007"));
    }
}