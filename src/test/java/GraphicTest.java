import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphicTest {

    @Test
    void printNumbers() {
        assertEquals(0, Graphic.printNumbers("1234"));
        assertEquals(1, Graphic.printNumbers("7.5,56"));
    }
}