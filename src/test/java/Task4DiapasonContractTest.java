import org.junit.Test;

import static org.junit.Assert.*;

public class Task4DiapasonContractTest {

    @Test
    public void exchangeContract() {
        Contract testObject = new Contract("1,2,4,5,6,7,8,9,11,12,15", ",", "-");
        assertEquals("1,2,4-9,11,12,15", testObject.exchangeContract());
    }
}