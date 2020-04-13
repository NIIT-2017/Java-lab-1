import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Lab1Task5Test {

    @Test
    public void main() {
        StringToPicture stp = new StringToPicture("123");
        assertEquals("   *     ***    ***  ",stp.getPicture()[0]);
        assertEquals("  **    *   *  *   * ",stp.getPicture()[1]);
        assertEquals("   *    *   *      * ",stp.getPicture()[2]);
        assertEquals("   *       *    **** ",stp.getPicture()[3]);
        assertEquals("   *      *        * ",stp.getPicture()[4]);
        assertEquals("   *    *      *   * ",stp.getPicture()[5]);
        assertEquals(" *****  *****   ***  ",stp.getPicture()[6]);
    }
}