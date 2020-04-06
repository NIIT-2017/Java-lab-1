import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task2Test {

    @Test
    void cutNumber() {
        assertEquals(15.937,task2.cutNumber(254,3));
        assertEquals(15.94,task2.cutNumber(254,2));
        assertEquals(2.00,task2.cutNumber(4,2));
    }
}