import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TaskThreeTest {

    @Test
    public void expand() {

        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1,2,4,5,6,7,18,19,20,21));
        assertEquals(TaskThree.expand("1,2,4-7,18-21"), result);
    }
}