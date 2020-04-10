package HomeworkLab1;
import java.lang.System;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Task5 {
    static String [][]numbers={
            {
                    "*****",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*****"
            },
            {
                    "    *",
                    "   **",
                    "  * *",
                    " *  *",
                    "    *"
            },
            {
                    "*****",
                    "   * ",
                    "  *  ",
                    "*    ",
                    "*****"
            },
            {
                    "*****",
                    "    *",
                    "*****",
                    "    *",
                    "*****"
            },
            {
                    "*   *",
                    "*   *",
                    "*****",
                    "    *",
                    "    *"
            },
            {
                    "*****",
                    "*    ",
                    "*****",
                    "    *",
                    "*****"
            },
            {
                    "*****",
                    "*    ",
                    "*****",
                    "*   *",
                    "*****"
            },
            {
                    "**** ",
                    "   * ",
                    "*****",
                    "   * ",
                    "   * "
            },
            {
                    "*****",
                    "*   *",
                    "*****",
                    "*   *",
                    "*****"
            },
            {
                    "*****",
                    "*   *",
                    "*****",
                    "    *",
                    "*****"
            }
    };
    public  static char[] print(String input)throws IOException
    {
        final int  numberLength=7;
        char []string=new char[(5+2)*input.length()];
        for(int i=0;i<5;i++)
        {

            for(int j=0;j<input.length();j++)
            {
                for(int k=0;k<numberLength;k++)
                {
                    if(k<5)
                        string[j*numberLength+k]=numbers[input.charAt(j)-'0'][i].charAt(k);
                    else
                        string[j*numberLength+k]=' ';
                }
            }
        }
        return string;
    }
}
