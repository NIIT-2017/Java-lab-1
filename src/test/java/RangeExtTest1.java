import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RangeExtTest1 {
    private String args;
    private ArrayList<Integer> expectedNums;
    private RangeExt rangeExt;

    @Before
    public void initialize() {
        rangeExt = new RangeExt();
    }

    public RangeExtTest1(String args,ArrayList<Integer> expectedNums) {
        this.args = args;
        this.expectedNums = expectedNums;

    }

    @Parameterized.Parameters(name = "{index}: Test{index}")
    public static Collection RangeExt() {
        ArrayList<Integer> expectedNums1 = new ArrayList<Integer>();
        Collections.addAll(expectedNums1, 1, 2, 3);
        //expectedNums1.clear();
        ArrayList<Integer> expectedNums2 = new ArrayList<Integer>();
        Collections.addAll(expectedNums2, 1, 2, 3, 5, 7,8,9);
        ArrayList<Integer> expectedNums3 = new ArrayList<Integer>();
        Collections.addAll(expectedNums3, 11,13, 15,16,17);
        ArrayList<Integer> expectedNums4 = new ArrayList<Integer>();
        Collections.addAll(expectedNums4, 111,113,175,176,177,178,179,180,181,182,183,184,185,186,187);

        return Arrays.asList(new Object[][]
                {
                        {"1-3", expectedNums1},
                        {"1-3,5,7-9", expectedNums2},
                        {"11,13,15-17", expectedNums3},
                        {"111,113,175-187", expectedNums4}
                });
    }

    @Test
    public void testRangeExt() {

        assertEquals(expectedNums, rangeExt.RangeNums(args));
    }
}