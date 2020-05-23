import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {

    Task3 task3Test=new Task3();

    @BeforeEach
    @org.junit.Test
   public void checkMakeFinishLine() {
       assertEquals("1,2,3,4,5,10",task3Test.makeFinishLine("1,2-5,10"));
    }

    @BeforeEach
    @org.junit.Test
   public void checkReplaseDefis() {
        StringBuffer forTest= new StringBuffer("1,2-5,10");
        StringBuffer resultTest = task3Test.replaseDefis(3,forTest);
        StringBuffer expTest=new StringBuffer(",3,4,");

        String expStr=expTest.toString();
        String resStr=resultTest.toString();

        assertEquals(expStr,resStr); //The only way
    }

    @BeforeEach
    @org.junit.Test
   public void checkFindMin() {
        StringBuffer forCheckMin=new StringBuffer("1,2-5,10");
        assertEquals(2,task3Test.findMin(3, forCheckMin));
    }

    @BeforeEach
    @org.junit.Test
    public void checkFindMax() {
      StringBuffer forCheckMax=new StringBuffer("1,2-5,10");
      assertEquals(5,task3Test.findMax(3,forCheckMax));
    }
}