import static org.junit.Assert.*;

public class CircleDemoTest
{
    @org.junit.Test
    public void exercise1Math_1() {
        assertEquals(15.92, CircleDemo.exercise1Math(1,0.001), 0.01);
    }
    @org.junit.Test
    public void exercise1Math_10() {
        assertEquals(15.92, CircleDemo.exercise1Math(10,0.001), 0.01);
    }
    @org.junit.Test
    public void exercise1Math_100() {
        assertEquals(15.92, CircleDemo.exercise1Math(100,0.001), 0.01);
    }
    @org.junit.Test
    public void exercise1Math_1000() {
        assertEquals(15.92, CircleDemo.exercise1Math(1000,0.001), 0.01);
    }

    @org.junit.Test
    public void exercise1Math_1000_001() {
        assertEquals(159.16, CircleDemo.exercise1Math(1000,0.01), 0.01);
    }
    @org.junit.Test
    public void exercise1Math_1000_01() {
        assertEquals(1591.55, CircleDemo.exercise1Math(1000,0.1), 0.01);
    }

    @org.junit.Test
    public void exercise1Math_6378_01() {
        assertEquals(1591.55, CircleDemo.exercise1Math(6378,0.1), 0.01);
    }
    @org.junit.Test
    public void exercise1Math_6378_001() {
        assertEquals(159.16, CircleDemo.exercise1Math(6378,0.01), 0.01);
    }

    @org.junit.Test
    public void exercise1Math() {
        assertEquals(15.92, CircleDemo.exercise1Math(6378, 0.001), 0.01);
    }
    @org.junit.Test
    public void exercise1Res() {
        assertEquals(15.92, CircleDemo.exercise1Res(), 0.01);
    }

    @org.junit.Test
    public void exercise2Math() {
        double price[] = CircleDemo.exercise2Math(3,1,1000,2000);
        double priceTrack = price[0];
        double priceFence = price[1];
        assertEquals(21991.13, priceTrack, 0.01);
        assertEquals(50265.44, priceFence, 0.01);
    }
    @org.junit.Test
    public void exercise2Res() {
        double price[] = CircleDemo.exercise2Res();
        double priceTrack = price[0];
        double priceFence = price[1];
        assertEquals(21991.13, priceTrack, 0.01);
        assertEquals(50265.44, priceFence, 0.01);
    }
}
