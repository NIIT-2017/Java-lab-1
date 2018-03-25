import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest {
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
       Main.main(new String[]{""});//вызвали main класса Main
      //         assertEquals("Сумма 5 и 6 равна 11\r\n", outStream.toString());//toString объект переводит в строку
    }
}