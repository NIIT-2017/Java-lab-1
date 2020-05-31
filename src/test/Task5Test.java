import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void getOutNum() {
       assertEquals(" ****   ***   *****   ***   ", Task5.getOutNum("9876", 0));
    }
}