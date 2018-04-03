import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ExpandTest {

    @Test
    public void expand() {
        String str = "1,2,4-7,18-21";
        ArrayList<Integer> namberListRezult = new ArrayList<Integer>();
        namberListRezult.add(new Integer(1));
        namberListRezult.add(new Integer(2));
        namberListRezult.add(new Integer(4));
        namberListRezult.add(new Integer(5));
        namberListRezult.add(new Integer(6));
        namberListRezult.add(new Integer(7));
        namberListRezult.add(new Integer(18));
        namberListRezult.add(new Integer(19));
        namberListRezult.add(new Integer(20));
        namberListRezult.add(new Integer(21));

        ArrayList<Integer> namberList = Expand.expand(str);
        for (int i = 0; i < namberList.size(); i++) {
            assertEquals(namberListRezult.get(i), namberList.get(i));
        }
        assertEquals(namberListRezult.size(), namberList.size());
    }
}