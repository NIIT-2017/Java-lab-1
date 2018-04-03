import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void main() {
        Sqrt s1=new Sqrt(2,0.01);
        assertEquals(1.41,s1.calc(),0.01);
        Sqrt s2=new Sqrt(9,0.1);
        assertEquals(3,s2.calc(),0.01);
    }
}