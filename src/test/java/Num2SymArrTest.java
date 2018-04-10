import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Num2SymArrTest {

    @Test
    public void num2SymArr() {
        String[] str1 = new String[] {"    *  " + "   *   " + "  ***  ",
                                      "   **  " + "  **   " + " *   * ",
                                      "  * *  " + " * *   " + "*     *",
                                      " *  *  " + "   *   " + "*     *",
                                      "****** " + "   *   " + "*     *",
                                      "    *  " + "   *   " + " *   * ",
                                      "    *  " + " ***** " + "  ***  "};
        assertEquals(str1,Num2SymArr.num2SymArr(410));
    }
}