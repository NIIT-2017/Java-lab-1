import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumbersToRangesTest {
    NumbersToRanges range = new NumbersToRanges();
    @Test
    public void stringToNumbers() {
        List<Integer> list1=List.of(1);
        List<Integer> list2=List.of(1,2,3,5);
        List<Integer> list3=List.of(1,2,3,5,10,11,12);
        List<Integer> list4=List.of(1,2,3,5,10,11,12,100);

        assertEquals(true, range.stringToNumbers("1").equals(list1));;
        assertEquals(true, range.stringToNumbers("1,2,3,5").equals(list2));;
        assertEquals(true, range.stringToNumbers("1,2,3,5,10,11,12").equals(list3));;
        assertEquals(true, range.stringToNumbers("1,2,3,5,10,11,12,100").equals(list4));;
    }

    @Test
    public void numbersToRanges() {
        List<String> list1=List.of("1");
        List<String> list2=List.of("1-3", "5");
        List<String> list3=List.of("1-3", "5", "10-12");
        List<String> list4=List.of("1-3", "5", "10-12","100");

        String line1="1";
        String line2="1,2,3,5";
        String line3="1,2,3,5,10,11,12";
        String line4="1,2,3,5,10,11,12,100";

        assertEquals(true, range.numbersToRanges(range.stringToNumbers(line1)).equals(list1));;
        assertEquals(true, range.numbersToRanges(range.stringToNumbers(line2)).equals(list2));;
        assertEquals(true, range.numbersToRanges(range.stringToNumbers(line3)).equals(list3));;
        assertEquals(true, range.numbersToRanges(range.stringToNumbers(line4)).equals(list4));;
    }
}