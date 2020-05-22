import static org.junit.Assert.*;
import org.junit.Test;

import HomeworkLab1.*;

public class Tests {
    public  static boolean compareStringsArray(String[] arrA,String[] arrB)
    {
        boolean flag=true;
        for(int i=0;i<arrA.length;i++)
        {
            if(!arrA[i].equals(arrB[i]))
            {
                flag = false;
                break;
            }
        }
        return  flag;
    }
    @Test
    public void TestTask1() throws Exception {
        assertEquals(524,Task1.func());
    }
    @Test
    public  void  TestTask2()
    {
        assertEquals(2,Task2.sqrt(4,0.1),0.001);
    }
    @Test
    public void TestTask3()
    {
        assertEquals("1,2,4,5,6,7,18,19,20,21",Task3.sequence("1,2,4-7,18-21"));
    }
    @Test
    public void TestTask4()
    {
        assertEquals("1-2,4-7,18-21",Task4.convolve("1,2,4,5,6,7,18,19,20,21"));
    }
    @Test
    public  void TestTask5() throws Exception
    {
        String []text={new String("    *  *****"),
                new String("   **     * ") ,
                new String("  * *    *  ") ,
                new String(" *  *  *    ") ,
                new String("    *  *****")};
        assertEquals(true,compareStringsArray( Task5.print("12"),text));

    }
    @Test
    public  void TestTask6()
    {
        assertEquals(1.5915494259388652E-4,Task6.main(),0.001);

    }
    @Test
    public  void TestTask7()
    {
        assertEquals(72256.63103256523,Task7.func(),0.001);
    }
}