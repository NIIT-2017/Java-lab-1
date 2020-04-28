import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @org.junit.jupiter.api.Test
    public void calc() throws Exception {
        zad2.Sqrt sqrt = new zad2.Sqrt(9,0.1);
        double actual = sqrt.calc();
        double expected = 3.0;
        assertEquals(expected,actual,0.1);

        zad2.Sqrt sqrt2 = new zad2.Sqrt(25,0.00000001);
        double actual2 = sqrt2.calc();
        double expected2 = 5.0000000;
        assertEquals(expected2,actual2,0.00000001);

        zad2.Sqrt sqrt3 = new zad2.Sqrt(25,0.1);
        double actual3 = sqrt3.calc();
        double expected3 = 5.00002317;
        assertEquals(expected3,actual3,0.00000001);
    }
}