import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.*;

public class CollatzTest {
    @Test
    public void lenCollatz() {
        assertEquals(20, Collatz.lenCollatz(19));
    }

    @Test
    public void maxLenCollatx() {
        HashMap hashMap = Collatz.maxLenCollatx(1, 10);
        assertEquals(new Long(9), hashMap.get("namber"));
        assertEquals( new Long(19), hashMap.get("len"));
    }


}
