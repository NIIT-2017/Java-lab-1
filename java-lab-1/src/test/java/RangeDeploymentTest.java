import org.junit.Test;

import static org.junit.Assert.*;

public class RangeDeploymentTest {

    @Test
    public void deploySequence() {
        assertEquals("1,2,3,4,5,6,20,21,22,23,24,25,30,31,32,33",
                RangeDeployment.deploySequence("1-6,20-25,30-33"));
    }
}