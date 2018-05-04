import org.junit.Test;

import static org.junit.Assert.*;

public class DigitsTest {

    @Test
    public void numberToArr() {
        String [] Ex = {" *  ***  *** ","** *   **   *"," * *  *     *"," *   *    ** "," *  *       *"," * *    *   *","******** *** "};
        String number = "123";
        Digits dig1=new Digits(number);
        assertEquals(Ex, dig1.NumberToArr());
    }
}