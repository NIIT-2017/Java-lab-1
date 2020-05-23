import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task5Test {

    @org.junit.Test
   public void checkSeeNumber() {
        String[] expStr={
                "   *   **** ",
                "   *   *    ",
                "  *    *    ",
                " *     *    ",
                "*      *    ",
                "*      *    ",
                "*****  ***  ",
                "*   *     * ",
                "*   *     * ",
                "*   *     * ",
                "*   * *   * ",
                "*   * *   * ",
                "*****  ***  "};

        String[] resStr=Task5.seeNumber("65");

        assertArrayEquals(expStr,resStr);
    }

}