import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task4Test {

    @org.junit.Test
    public void checkMadeFinishLine() {
        assertEquals("1,2,4-7,18-21", Task4.madeFinishLine("1,2,4,5,6,7,18,19,20,21"));
    }

    @org.junit.Test
    public void checkAnalisNum() {
        StringBuffer finTest = new StringBuffer("");
        StringBuffer resultTest = Task4.analisNum(1, finTest, 1, 23);
        StringBuffer expTest = new StringBuffer("");

        String expStr = expTest.toString();
        String resStr = resultTest.toString();

        assertEquals(expStr, resStr);
    }
}