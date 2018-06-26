package WrapSeq;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MethodsTest {

    @Test
    public void wordToArrToInt() {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        assertEquals(arr, new Methods().wordToArrToInt("1,2,3"));
    }
}

