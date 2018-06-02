import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RangeExtTest2 {
    private String args;
    private List expectedNums;
    private RangeExt rangeExt;

    @Before
    public void initialize() {
        rangeExt = new RangeExt();
    }

    public RangeExtTest2(String args, List expectedNums) {
        this.args = args;
        this.expectedNums = expectedNums;
    }

    @Parameterized.Parameters(name = "{index}: {0} == rangeNums{1}")
    public static Collection rangNumb() {

        return Arrays.asList(new Object[][]
                {
                        {"1-3", Arrays.asList(1, 2, 3)},
                        {"1-3,5,7-9", Arrays.asList(1, 2, 3, 5, 7, 8, 9)},
                        {"11,13,15-17", Arrays.asList(11, 13, 15, 16, 17)},
                        {"111,113,175-187", Arrays.asList(111, 113, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187)}
                });
    }

    @Test
    public void testRangeExt() {
        System.out.println("Parameterized Number is : " + args + "=" + expectedNums);
        assertEquals(expectedNums, rangeExt.RangeNums(args));
    }
}