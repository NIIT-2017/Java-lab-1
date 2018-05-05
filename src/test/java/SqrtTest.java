import static org.junit.Assert.*;

public class SqrtTest
{
    @org.junit.Test
    public void calc_2_3() {
        Sqrt sqrtTest = new Sqrt(2,3);
        assertEquals(1.414, sqrtTest.calc(),0.001);
    }

    @org.junit.Test
    public void calc_2_9() {
        Sqrt sqrtTest = new Sqrt(2,9);
        assertEquals(Math.sqrt(2), sqrtTest.calc(),0.000000001);
    }

    @org.junit.Test
    public void calc_2_15() {
        Sqrt sqrtTest = new Sqrt(2,15);
        assertEquals(Math.sqrt(sqrtTest.getArg()), sqrtTest.calc(),0.000000000000001);
    }

    @org.junit.Test
    public void calc_3_14() {
        Sqrt sqrtTest = new Sqrt(3,14);
        assertEquals(Math.sqrt(sqrtTest.getArg()), sqrtTest.calc(), sqrtTest.delta);
    }

    @org.junit.Test
    public void calc_5_12() {
        Sqrt sqrtTest = new Sqrt(5,12);
        assertEquals(Math.sqrt(sqrtTest.getArg()), sqrtTest.calc(), sqrtTest.delta);
    }


    @org.junit.Test
    public void iter_3_15() {
        Sqrt sqrtTest = new Sqrt(3,15);
        assertEquals(Math.sqrt(3), sqrtTest.iter(1.0,3),0.000000000000001);
    }

    @org.junit.Test
    public void iter_5_14() {
        Sqrt sqrtTest = new Sqrt(5,14);
        assertEquals(Math.sqrt(sqrtTest.getArg()), sqrtTest.iter(1.0, sqrtTest.getArg()), sqrtTest.delta);
    }

    @org.junit.Test
    public void iter_7_13() {
        Sqrt sqrtTest = new Sqrt(7,13);
        assertEquals(Math.sqrt(sqrtTest.getArg()), sqrtTest.iter(1.0, sqrtTest.getArg()), sqrtTest.delta);
    }


    @org.junit.Test
    public void improve_2_1() {
        Sqrt sqrtTest = new Sqrt(2, 0);
        assertEquals(1.5, sqrtTest.improve(1, sqrtTest.getArg()),0);
    }

    @org.junit.Test
    public void improve_2_15() {
        Sqrt sqrtTest = new Sqrt(2,0);
        assertEquals(1.417, sqrtTest.improve(1.5, sqrtTest.getArg()),0.001);
    }

    @org.junit.Test
    public void improve_2_1417() {
        Sqrt sqrtTest = new Sqrt(2,0);
        assertEquals(1.414, sqrtTest.improve(1.417, sqrtTest.getArg()),0.001);
    }

    @org.junit.Test
    public void improve_2_1414() {
        Sqrt sqrtTest = new Sqrt(2,0);
        assertEquals(1.414, sqrtTest.improve(1.414, sqrtTest.getArg()),0.001);
    }


    @org.junit.Test
    public void average_2_1() {
        Sqrt sqrtTest = new Sqrt(2,0);
        assertEquals(1.5, sqrtTest.average(1,sqrtTest.getArg()/1),0);
    }

    @org.junit.Test
    public void average_2_1414() {
        Sqrt sqrtTest = new Sqrt(2,0);
        assertEquals(1.414, sqrtTest.average(1.414,sqrtTest.getArg()/1.414),0.001);
    }


    @org.junit.Test
    public void good_2_3_1414() {
        Sqrt sqrtTest = new Sqrt(2,3);
        assertEquals(true, sqrtTest.good(1.414, sqrtTest.getArg()));
    }

    @org.junit.Test
    public void good_3_3_1732() {
        Sqrt sqrtTest = new Sqrt(3,3);
        assertEquals(true, sqrtTest.good(1.732, sqrtTest.getArg()));
    }

    @org.junit.Test
    public void getArg_256() {
        Sqrt sqrtTest = new Sqrt(256,0);
        assertEquals(256, sqrtTest.getArg(),0);
    }

    @org.junit.Test
    public void Delta_000001() {
        Sqrt sqrtTest = new Sqrt(0,6);
        assertEquals(0.000001, sqrtTest.delta,0);
    }
}
