package collatz;

import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class CollatzTest {

    @Test
    public void collatz() throws Exception {
        int step = Collatz.collatz(3);
        assertEquals(7,step);
    }

    @Test
    public void findMaxSequence() throws Exception {
        Map<Integer,Integer> rez = Collatz.findMaxSequence(4);
        Set<Map.Entry<Integer,Integer>> set = rez.entrySet();
        Map.Entry entry = set.iterator().next();
        assertEquals(7,entry.getKey());
    }

    @Test(expected = NumberFormatException.class)
    public void findMaxSequenceException() throws Exception{
        Collatz.findMaxSequence(-4);
    }

    @Test(expected = NumberFormatException.class)
    public void mainStringInput(){
        Collatz.main(new String[]{"abc"});
    }

    @Test(expected = NumberFormatException.class)
    public void mainNonIntegerInput(){
        Collatz.main(new String[]{"0.5"});
    }
}