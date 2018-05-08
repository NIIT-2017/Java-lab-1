import static org.junit.Assert.*;

public class SqrtDemoTest
{
    @org.junit.Test
    public void sqrtMath_2_15() {
        assertEquals(Math.sqrt(2), SqrtDemo.sqrtMath(2, 15), Math.pow(10,-15));
    }

    @org.junit.Test
    public void sqrtDelMath_3_14_() {
        double results[] = SqrtDemo.sqrtDelMath(3, 14);
        double result = results[0];
        double delta = results[1];
        assertEquals(Math.sqrt(3), result, delta);
    }

    @org.junit.Test
    public void sqrtDelMath_3_14() {
        double results[] = SqrtDemo.sqrtDelMath(3, 14);
        assertEquals(Math.sqrt(3), results[0], results[1]);
    }

    @org.junit.Test
    public void sqrtDelMath_5_13() {
        double results[] = SqrtDemo.sqrtDelMath(5, 13);
        assertEquals(Math.sqrt(5), results[0], results[1]);
    }

    @org.junit.Test
    public void sqrtDelArgMath_7_15() {
        double results[] = SqrtDemo.sqrtDelArgMath(7, 15);
        double result = results[0];
        double delta = results[1];
        double number = results[2];
        assertEquals(Math.sqrt(number), result, delta);
    }

    @org.junit.Test
    public void sqrtDelArgMath_11_11() {
        double results[] = SqrtDemo.sqrtDelArgMath(11, 11);
        assertEquals(Math.sqrt(results[2]), results[0], results[1]);
    }

    @org.junit.Test
    public void sqrtRes2_3() {
        assertEquals(Math.sqrt(2), SqrtDemo.sqrtRes2_3(), Math.pow(10,-3));
    }

    @org.junit.Test
    public void sqrtRes7_15() {
        assertEquals(Math.sqrt(7), SqrtDemo.sqrtRes7_15(), Math.pow(10,-15));
    }
}
