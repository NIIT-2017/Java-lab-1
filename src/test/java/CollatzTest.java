
import niit.lab1.task1.CollatzLib;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CollatzTest {
  @Test
  public void evaluatesCollatz() {
    CollatzLib collatz = new CollatzLib();
    collatz.findMaxCollatz();
    long num = collatz.getNum();
    assertEquals(837799L, collatz.getNum());
//    
  }
}