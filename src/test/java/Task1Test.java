import static org.junit.Assert.*;

public class Task1Test {

    @org.junit.Test
    public void collaz() throws Exception {
        assertEquals(9,Task1.collaz(13));
        assertEquals(524,Task1.collaz(837799));
        assertEquals(20,Task1.collaz(19));
    }
}