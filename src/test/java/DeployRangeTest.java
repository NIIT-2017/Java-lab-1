import static org.junit.Assert.*;

public class DeployRangeTest
{
    @org.junit.Test
    public void splitCom() {
        String string = ("0,1,2,3,4,5,6,7,8,9");
        String[] strArr = {"0","1","2","3","4","5","6","7","8","9"};
        assertArrayEquals(strArr, DeployRange.splitCom(string));
    }

    @org.junit.Test
    public void splitHyp() {
        String string = ("0,1,2,3,4,5,6,7,8,9");
        String[] strArr = {"0","1","2","3","4","5","6","7","8","9"};
        assertArrayEquals(strArr, DeployRange.splitCom(string));
    }

    @org.junit.Test
    public void pars() {
        String string = ("123");
        assertEquals(123, DeployRange.pars(string));
    }

    @org.junit.Test
    public void toStr() {
        String string = ("12345");
        assertEquals(string, DeployRange.toStr(12345));
    }

    @org.junit.Test
    public void guessArrLength_1() {
        String[] strArr = {"1","2","3","4","5","6","7","8","9"};
        assertEquals(10, DeployRange.guessArrLength(strArr));
    }

    @org.junit.Test
    public void guessArrLength_2() {
        String[] strArr = {"0","1","2","3","4","5","6","7","8","9"};
        assertEquals(10, DeployRange.guessArrLength(strArr));
    }

    @org.junit.Test
    public void guessArrLength_3() {
        String[] strArr = {"1","2","3","4","5","6","7","8","10-20"};
        assertEquals(21, DeployRange.guessArrLength(strArr));
    }

    @org.junit.Test
    public void guessArrLength_4() {
        String[] strArr = {"0","1","2","3","4","5","6","7","8","10-20"};
        assertEquals(21, DeployRange.guessArrLength(strArr));
    }
    @org.junit.Test
    public void deploy() {
        String[] strArr = {"1","2-4","5-7","9","12-15"};
        String strRes = ("1,2,3,4,5,6,7,9,12,13,14,15");
        assertEquals(strRes, DeployRange.deploy(strArr));
    }

    @org.junit.Test
    public void strArrRes() {
        String string = ("1,3,5-6,8-10,12-15");
        String[] strArrRes = {"1","3","5","6","8","9","10","12","13","14","15"};
        assertArrayEquals(strArrRes, DeployRange.strArrRes(string));
    }

    @org.junit.Test
    public void strRes() {
        String string = ("1-24");
        String strRes = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24");
        assertEquals(strRes, DeployRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_1() {
        String string = ("1-12,13-23");
        String strRes = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23");
        assertEquals(strRes, DeployRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_2() {
        String string = ("1-8,9-16,17-22");
        String strRes = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22");
        assertEquals(strRes, DeployRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_3() {
        String string = ("1-6,7-12,13-18,19-21");
        String strRes = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21");
        assertEquals(strRes, DeployRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_4() {
        String string = ("1-4,5-8,9-12,13-16,17-20");
        String strRes = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20");
        assertEquals(strRes, DeployRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_5() {
        String string = ("1-2,3,4-5,6,7,8-9,10-11,12,13,14-16,17-19");
        String strRes = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19");
        assertEquals(strRes, DeployRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_6() {
        String string = ("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34");
        String strRes = ("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34");
        assertEquals(strRes, DeployRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_7() {
        String string = ("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100");
        String strRes = ("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100");
        assertEquals(strRes, DeployRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_8() {
        String string = ("1,2,4,7,11-12,14-16,19-22");
        String strRes = ("1,2,4,7,11,12,14,15,16,19,20,21,22");
        assertEquals(strRes, DeployRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_9() {
        String string = ("1,3-4,7,9,13-15,20,21-22");
        String strRes = ("1,3,4,7,9,13,14,15,20,21,22");
        assertEquals(strRes, DeployRange.strRes(string));
    }
}
