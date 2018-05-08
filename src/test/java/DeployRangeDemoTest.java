import static org.junit.Assert.*;

public class DeployRangeDemoTest
{
    @org.junit.Test
    public void strArr_1() {
        String string = ("0,1,2,3,4,5,6,7,8,9");
        String[] strArr = {"0","1","2","3","4","5","6","7","8","9"};
        assertArrayEquals(strArr, DeployRangeDemo.strArr(string));
    }

    @org.junit.Test
    public void strArr_2() {
        String string = ("1-10");
        String[] strArr = {"1","2","3","4","5","6","7","8","9","10"};
        assertArrayEquals(strArr, DeployRangeDemo.strArr(string));
    }

    @org.junit.Test
    public void str_1() {
        String string = ("1-24");
        String strRes = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24");
        assertEquals(strRes, DeployRangeDemo.str(string));
    }

    @org.junit.Test
    public void str_2() {
        String string = ("1-12,13-23");
        String strRes = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23");
        assertEquals(strRes, DeployRangeDemo.str(string));
    }

    @org.junit.Test
    public void str_3() {
        String string = ("1-8,9-16,17-22");
        String strRes = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22");
        assertEquals(strRes, DeployRangeDemo.str(string));
    }

    @org.junit.Test
    public void str_4() {
        String string = ("1-6,7-12,13-18,19-21");
        String strRes = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21");
        assertEquals(strRes, DeployRangeDemo.str(string));
    }

    @org.junit.Test
    public void str_5() {
        String string = ("1-2,3,4-5,6,7,8-9,10-11,12,13,14-16,17-19");
        String strRes = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19");
        assertEquals(strRes, DeployRangeDemo.str(string));
    }

    @org.junit.Test
    public void str_6() {
        String string = ("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34");
        String strRes = ("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34");
        assertEquals(strRes, DeployRangeDemo.str(string));
    }

    @org.junit.Test
    public void str_7() {
        String string = ("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100");
        String strRes = ("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100");
        assertEquals(strRes, DeployRangeDemo.str(string));
    }

    @org.junit.Test
    public void str_8() {
        String string = ("1,2,4,7,11-12,14-16,19-22");
        String strRes = ("1,2,4,7,11,12,14,15,16,19,20,21,22");
        assertEquals(strRes, DeployRangeDemo.str(string));
    }

    @org.junit.Test
    public void str_9() {
        String string = ("1,3-4,7,9,13-15,20,21-22");
        String strRes = ("1,3,4,7,9,13,14,15,20,21,22");
        assertEquals(strRes, DeployRangeDemo.str(string));
    }

    @org.junit.Test
    public void str_10() {
        String string = ("1,2,3,5,8,10-11,13-15,18-22,23-28");
        String strRes = ("1,2,3,5,8,10,11,13,14,15,18,19,20,21,22,23,24,25,26,27,28");
        assertEquals(strRes, DeployRangeDemo.str(string));
    }

    @org.junit.Test
    public void str_11() {
        String string = ("1-4,5-8,9-12,13-16,17-20");
        String strRes = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20");
        assertEquals(strRes, DeployRangeDemo.str(string));
    }

    @org.junit.Test
    public void str_12() {
        String string = ("0-12");
        String strRes = ("0,1,2,3,4,5,6,7,8,9,10,11,12");
        assertEquals(strRes, DeployRangeDemo.str(string));
    }
}
