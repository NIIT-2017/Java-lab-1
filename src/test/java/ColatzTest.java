import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColatzTest {
    Colatz colatz = new Colatz();

    @Test
    public void evenUneven(){
        assertEquals(0,colatz.evenUneven(3));
        assertEquals(1,colatz.evenUneven(4));
    }

    @Test
    public void getColatz() {
        assertEquals(0,colatz.getColatz(1));
        assertEquals(20,colatz.getColatz(19));
        assertEquals(111,colatz.getColatz(27));
    }

    @Test
    public void getMax_colatz() {
        assertEquals(9,colatz.getMax_colatz(1,10));
        assertEquals(97,colatz.getMax_colatz(1,100));
        assertEquals(910107,colatz.getMax_colatz(1,1000000));
    }
}