import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import HomeworkLab1.*;
import static org.junit.jupiter.api.Assertions.*;

class Test {

    public static boolean almostEqual(double a, double b, double eps){
        return Math.abs(a-b)<eps;
    }
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
    @org.junit.jupiter.api.Test
    void func() throws Exception {
        assertEquals(524,Task1.func());
        assertEquals(true,almostEqual(Task2.sqrt(4,0.1),2,0.001));
        assertEquals("1,2,4,5,6,7,18,19,20,21",Task3.sequence("1,2,4-7,18-21"));
        assertEquals("1-2,4-7,18-21",Task4.convolve("1,2,4,5,6,7,18,19,20,21"));
        String []text={new String("    *  *****"),
                       new String("   **     * ") ,
                       new String("  * *    *  ") ,
                       new String(" *  *  *    ") ,
                       new String("    *  *****")};
        assertEquals(true,compareStringsArray( Task5.print("12"),text));
        assertEquals(1.5915494259388652E-4,Task6.main());
        assertEquals(72256.63103256523,Task7.func());
    }
}