import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RangeToNumbersTest {
    RangeToNumbers range = new RangeToNumbers();
    @Test
    public void rangeToNumbers() {
        List<Integer> list1=List.of(1);
        List<Integer> list2=List.of(1,2,3);
        List<Integer> list3=List.of(1,2,3,5,6,7);
        List<Integer> list4=List.of(1,2,3,5,7,8,9);
        List<Integer> list5=List.of(1,2,3,5,7,8,9,11);

        assertEquals(true, range.rangeToNumbers("1").equals(list1));;
        assertEquals(true, range.rangeToNumbers("1-3").equals(list2));;
        assertEquals(true, range.rangeToNumbers("1-3,5-7").equals(list3));;
        assertEquals(true, range.rangeToNumbers("1-3,5,7-9").equals(list4));;
        assertEquals(true, range.rangeToNumbers("1-3,5,7-9,11").equals(list5));;
    }
}