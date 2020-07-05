import org.junit.Test;

import static org.junit.Assert.*;

public class task5Test {

    @Test
    public void toChange() {
       assertEquals(" *** ", task5.ToChange("3",0));
       assertEquals("*  *  ", task5.ToChange("4",3));
       assertEquals("*   *", task5.ToChange("8",1));
       assertEquals(" * ", task5.ToChange("1",4));
       assertEquals(" *** ", task5.ToChange("6",6));
    }
}