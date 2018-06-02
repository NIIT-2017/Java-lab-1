import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SqrtTest3 {
    private Double arg;
    private Double delta;
    private Double expectedResult;
    private Sqrt sqrt;

    @Before
    public void initialize() {
        sqrt = new Sqrt(arg, delta);
    }

    // Each parameter should be placed as an argument here
    // Every time runner triggers, it will pass the arguments
    // from parameters we defined in primeNumbers() method

    public SqrtTest3(double arg, double delta,double expectedResult) {
        this.arg = arg;
        this.delta = delta;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "{index}: Test{index}")
    public static Collection sqrtNumbers() {
        return Arrays.asList(new Object[][] {
                {3.0,0.001,1.7321428571428572},
                {4.0,0.00001,2.0},
                {256.0,0.1,16},
                {10.0,0.0001,3.162277665175675},
                {11.5,0.001,3.3911650157914472},
                {1.0,0.001,1},
                {2.0,0.01,1.4166666666666665}

        });
    }

    // This test will run 4 times since we have 5 parameters defined
    @Test

    public void testPrimeNumberChecker() {
        System.out.println("Parameterized Number is : " + arg + "=" + expectedResult);
        assertEquals(expectedResult,
                sqrt.calc(),delta);
    }
}