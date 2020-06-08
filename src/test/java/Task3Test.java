import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {
    String actual;
    String expected;

    @org.junit.Test
    public void table() throws Exception{

        //for string #1 = "1-4"
        actual = Task3.table("1-4");
        expected = "[1, 2, 3, 4]";
        assertEquals(expected,actual);

        //for string #2 = "1,2,4-7,18-21"
        actual = Task3.table("1,2,4-7,18-21");
        expected = "[1, 2, 4, 5, 6, 7, 18, 19, 20, 21]";
        assertEquals(expected,actual);

        //for string #3 = "1   ,   2  -7, 100-   105, 108"
        actual = Task3.table("1   ,   2  -7, 100-   105, 108");
        expected = "[1, 2, 3, 4, 5, 6, 7, 100, 101, 102, 103, 104, 105, 108]";
        assertEquals(expected,actual);
    }
}