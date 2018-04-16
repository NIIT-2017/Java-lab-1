import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class UnrollTest {

    private final ByteArrayOutputStream outStream= new ByteArrayOutputStream();
    @Before
    public void setup(){
        System.setOut(new PrintStream(outStream));//перенаправляет ст потока setOut в наш outStream
    }
    @After
    public void clean(){
        System.setOut(null);
    }
    @Test
    public void main() {
        Unroll.main(new String[]{"1,2,3,4-9,10,11-18"});//вызвали main класса Unroll
        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18", outStream.toString());//toString объект переводит в строку
    }
}