import com.chars.perform.CharPerform;
import org.junit.Test;

import java.util.Arrays;

import static dev.gord.out.Output.print;
import static org.junit.Assert.*;

public class CharDigitTest {

    @Test
    public void performCharDigit() {
        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < CharPerform.ONE.length; i++) {
            expected.append(CharPerform.ONE[i]);
            expected.append('\n');
        }
        expected.append('\n');

        assertEquals(expected.toString(), new CharDigit().performCharDigit(CharPerform.ONE));

    }

    @Test
    public void outCharDigit() {
        StringBuilder ex = new StringBuilder();
        for (int i = 0; i < CharPerform.ONE.length; i++) {
            ex.append(CharPerform.ONE[i]);
            ex.append('\n');
        }
        ex.append('\n');
        for (int i = 0; i < CharPerform.TWO.length; i++) {
            ex.append(CharPerform.TWO[i]);
            ex.append('\n');
        }
        ex.append('\n');
        for (int i = 0; i < CharPerform.THREE.length; i++) {
            ex.append(CharPerform.THREE[i]);
            ex.append('\n');
        }

        assertEquals(ex.toString(), new CharDigit().outCharDigit("123"));

    }

}