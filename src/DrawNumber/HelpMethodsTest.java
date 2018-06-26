package DrawNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelpMethodsTest {

    @Test
    public void callNumberTest() {
        char a = '1';
        String[] num1 =
                       {"   *   ",
                        "  **   ",
                        "   *   ",
                        "   *   ",
                        "   *   ",
                        "   *   ",
                        "  ***  "};

        assertEquals(num1, new HelpMethods().callNumber(a));
    }
}