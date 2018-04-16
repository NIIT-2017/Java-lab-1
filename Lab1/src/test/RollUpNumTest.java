import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RollUpNumTest {



    private final ByteArrayOutputStream outStream= new ByteArrayOutputStream();
    @Before
    public void setup(){
        System.setOut(new PrintStream(outStream));//перенаправляет ст поток setOut в наш outStream
    }
    @After
    public void clean(){
        System.setOut(null);
    }
    @Test
    public void main() {
        RollUpNum.main(new String[]{"0,1,2,4,5,6,11,12,13,14,18"});//вызвали main класса RollUpNum
        assertEquals("0-2,4-6,11-14,18", outStream.toString());//toString объект переводит в строку
    }
}
