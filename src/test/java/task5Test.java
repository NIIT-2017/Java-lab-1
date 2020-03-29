import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class task5Test {
    @Test
    public void getOutpotString() {
        Assert.assertEquals(" *   *   **   *   *  *   *  ", task5.getOutpotString("0123", 1));
    }
}