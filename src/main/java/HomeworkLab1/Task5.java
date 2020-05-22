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
    public  static String[] print(String input)throws IOException
    {
        final int  numberLength=7;
        String[] levels=new String[5];
        for(int i=0;i<input.length();i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==0)
                    levels[j]=new String();
                levels[j]+=numbers[(int)input.charAt(i)-'0'][j];
                if(i!=input.length()-1)
                    levels[j]+="  ";
            }
        }

        return levels;
    }
}
