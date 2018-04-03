import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReduceTest {

    @Test
    public void strToArrInteger() {
        ArrayList<Integer> inputArrList = new ArrayList<Integer>();
        inputArrList.add(new Integer(1));
        inputArrList.add(new Integer(2));
        inputArrList.add(new Integer(4));
        inputArrList.add(new Integer(5));
        inputArrList.add(new Integer(6));
        inputArrList.add(new Integer(7));
        inputArrList.add(new Integer(18));
        inputArrList.add(new Integer(19));
        inputArrList.add(new Integer(20));
        inputArrList.add(new Integer(21));
        assertEquals(inputArrList, Reduce.strToArrInteger("1,2,4,5,6,7,18,19,20,21"));
    }

    @Test
    public void reduce() {
        ArrayList<Integer> inputArrList = new ArrayList<Integer>();
        inputArrList.add(new Integer(1));
        inputArrList.add(new Integer(2));
        inputArrList.add(new Integer(4));
        inputArrList.add(new Integer(5));
        inputArrList.add(new Integer(6));
        inputArrList.add(new Integer(7));
        inputArrList.add(new Integer(18));
        inputArrList.add(new Integer(19));
        inputArrList.add(new Integer(20));
        inputArrList.add(new Integer(21));
        assertEquals("1,2,4-7,18-21.", Reduce.reduce(inputArrList));

    }
}