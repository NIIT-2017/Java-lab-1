import org.junit.Test;

import static org.junit.Assert.*;

public class Task4Test {

    @Test
    public void comeBack() {
        Task4 testComeBack = new Task4();
        assertEquals("1,2,4-8,12,14-17", Task4.ComeBack("1,2,4,5,6,7,8,12,14,15,16,17") );
    }
}