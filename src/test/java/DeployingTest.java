import org.junit.Test;

import static org.junit.Assert.*;

class DeployingTest {

    @Test
    void toDeployString1() {
        assertEquals("100,102,105,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220", Deploying.toDeployString("100,102,105,200-220"));
    }
    @Test
    void toDeployString2() {
        assertEquals("9,10,300,301,302,303,304,305,306,307,15,16,17,18,19,20", Deploying.toDeployString("9,10,300-307,15-20"));
    }
    @Test
    void toDeployString3() {
        assertEquals("1,2,4,5,6,7,18,19,20,21", Deploying.toDeployString("1,2,4-7,18-21"));
    }

}