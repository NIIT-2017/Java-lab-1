import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToSymbolTest {

    @Test
    public void makeString() {
        assertEquals(" ***     ", NumberToSymbol.makeString("3", 0));
    }
    @Test
    public void makeString1() {
        assertEquals(" *****   ****       *      ", NumberToSymbol.makeString("963", 3));
    }
    @Test
    public void makeString2() {
        assertEquals(" *         ***       ***     ***     ***     *****    ", NumberToSymbol.makeString("751862", 6));
    }



}