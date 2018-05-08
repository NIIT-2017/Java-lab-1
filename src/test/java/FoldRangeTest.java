import static org.junit.Assert.*;

public class FoldRangeTest
{
    @org.junit.Test
    public void splitCom() {
        String string = ("0,1,2,3,4,5,6,7,8,9,10");
        String[] strArr = {"0","1","2","3","4","5","6","7","8","9","10"};
        assertArrayEquals(strArr, FoldRange.splitCom(string));
    }

    @org.junit.Test
    public void pars() {
        String string = ("123456789");
        assertEquals(123456789, FoldRange.pars(string));
    }

    @org.junit.Test
    public void fold_1() {
        String[] strArr = {"0","1","2","3","4","5","6","7","8","9","10"};
        String strRes = ("0-10");
        assertEquals(strRes, FoldRange.fold(strArr));
    }

    @org.junit.Test
    public void fold_2() {
        String[] strArr = {"0","1","3","4","5","7","8","9","10"};
        String strRes = ("0-1,3-5,7-10");
        assertEquals(strRes, FoldRange.fold(strArr));
    }

    @org.junit.Test
    public void fold_3() {
        String[] strArr = {"0","2","3","5","6","7","9","10","11","12"};
        String strRes = ("0,2-3,5-7,9-12");
        assertEquals(strRes, FoldRange.fold(strArr));
    }

    @org.junit.Test
    public void fold_4() {
        String[] strArr = {"0","2","4","6","8","11","13","15","17"};
        String strRes = ("0,2,4,6,8,11,13,15,17");
        assertEquals(strRes, FoldRange.fold(strArr));
    }

    @org.junit.Test
    public void strRes_1() {
        String string = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24");
        String strRes = ("1-24");
        assertEquals(strRes, FoldRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_2() {
        String string = ("1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23");
        String strRes = ("1-2,4-23");
        assertEquals(strRes, FoldRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_3() {
        String string = ("1,2,3,5,6,7,8,11,12,13,14,15,16,17,18,19,20,21,22");
        String strRes = ("1-3,5-8,11-22");
        assertEquals(strRes, FoldRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_4() {
        String string = ("1,2,3,4,6,7,8,9,10,13,14,15,16,17,18,22,23,24");
        String strRes = ("1-4,6-10,13-18,22-24");
        assertEquals(strRes, FoldRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_5() {
        String string = ("1,2,4,5,7,8,10,11,13,14,15,16,17,18,19,20,21");
        String strRes = ("1-2,4-5,7-8,10-11,13-21");
        assertEquals(strRes, FoldRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_6() {
        String string = ("1,2,4,5,6,9,10,11,12,16,17,18,19,20,25,26,27,28,29,30");
        String strRes = ("1-2,4-6,9-12,16-20,25-30");
        assertEquals(strRes, FoldRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_7() {
        String string = ("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34");
        String strRes = ("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34");
        assertEquals(strRes, FoldRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_8() {
        String string = ("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100");
        String strRes = ("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100");
        assertEquals(strRes, FoldRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_9() {
        String string = ("1,2,4,7,11,12,14,15,16,19,20,21,22");
        String strRes = ("1-2,4,7,11-12,14-16,19-22");
        assertEquals(strRes, FoldRange.strRes(string));
    }

    @org.junit.Test
    public void strRes_10() {
        String string = ("1,3,4,7,9,13,14,15,20,21,22");
        String strRes = ("1,3-4,7,9,13-15,20-22");
        assertEquals(strRes, FoldRange.strRes(string));
    }
}
