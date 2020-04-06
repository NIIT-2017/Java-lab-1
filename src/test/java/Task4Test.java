import org.junit.Test;

import static org.junit.Assert.*;

public class Task4Test {
    String actual;
    String expected;
    @org.junit.Test
    public void table() throws Exception{
        //for string #1 = "1-4"
        actual = Task4.table("1,2,3,4");
        expected = "1-4";
        assertEquals(expected,actual);

        //for string #2 = "1,2,4,5,6,7,18,19,20,21"
        actual = Task4.table("1,2,4,5,6,7,18,19,20,21");
        expected = "1,2,4-7,18-21";
        assertEquals(expected,actual);

        //for string #3 = "1"
        actual = Task4.table("1");
        expected = "1";
        assertEquals(expected,actual);

        //for string #4 = "3,   5 , 6 , 7 ,8"
        actual = Task4.table("3,   5 , 6 , 7 ,8");
        expected = "3,5-8";
        assertEquals(expected,actual);
    }
}