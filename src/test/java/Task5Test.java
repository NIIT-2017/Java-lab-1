import org.junit.Test;

import static org.junit.Assert.*;

public class Task5Test {

    @org.junit.Test
    public void table() throws Exception{

        // test to output the number '0'
        assertEquals("   ***   ",Task5.table("0",1,0));
        assertEquals("  *   *  ",Task5.table("0",1,1));
        assertEquals(" *     * ",Task5.table("0",1,2));
        assertEquals(" *     * ",Task5.table("0",1,3));
        assertEquals(" *     * ",Task5.table("0",1,4));
        assertEquals("  *   *  ",Task5.table("0",1,5));
        assertEquals("   ***   ",Task5.table("0",1,6));

        // test to output the number '123'
        assertEquals("    *       ***      ***   ",Task5.table("123",3,0));
        assertEquals("   **      *   *    *   *  ",Task5.table("123",3,1));
        assertEquals("    *      *  *         *  ",Task5.table("123",3,2));
        assertEquals("    *        *       ***   ",Task5.table("123",3,3));
        assertEquals("    *       *           *  ",Task5.table("123",3,4));
        assertEquals("    *      *            *  ",Task5.table("123",3,5));
        assertEquals("   ***     *****    ****   ",Task5.table("123",3,6));
    }
}