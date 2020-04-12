import org.junit.Test;

import static org.junit.Assert.*;

class NumberToSymbolTest {

    @Test
    void makeString() {
        assertEquals(" ***     ", NumberToSymbol.makeString("3", 0));
    }
    @Test
    void makeString1() {
        assertEquals(" *****   ****       *      ", NumberToSymbol.makeString("963", 3));
    }
    @Test
    void makeString2() {
        assertEquals(" *         ***       ***     ***     ***     *****    ", NumberToSymbol.makeString("751862", 6));
    }



}