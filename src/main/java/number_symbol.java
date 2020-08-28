import java.util.Scanner;

public class number_symbol {
    public static void main(String[] args) {
        String [] m_1 = new String [] {"   *   ","  **   "," * *   ","   *   ","   *   ","   *   ","  ***  "};
        String [] m_2 = new String [] {" ***   ","*   *  ","*  *   ","  *    "," *     ","*      ","*****  "};
        String [] m_3 = new String [] {" ***   ","*   *  ","    *  ","  ***  ","    *  ","*   *  "," ***   "};
        String [] m_4 = new String [] {"   *   ","  **   "," * *   ","*  *   ","*****  ","   *   ","   *   "};
        String [] m_5 = new String [] {"*****  ","*      ","*      ","*****  ","    *  ","    *  ","*****  "};
        String [] m_6 = new String [] {"*****  ","*      ","*      ","*****  ","*   *  ","*   *  ","*****  "};
        String [] m_7 = new String [] {"*****  ","    *  ","   *   ","  *    "," *     ","*      ","*      "};
        String [] m_8 = new String [] {"*****  ","*   *  ","*   *  ","*****  ","*   *  ","*   *  ","*****  "};
        String [] m_9 = new String [] {"*****  ","*   *  ","*   *  ","*****  ","    *  ","    *  ","*****  "};
        String [] m_0 = new String [] {"*****  ","*   *  ","*   *  ","*   *  ","*   *  ","*   *  ","*****  "};
        Scanner num = new Scanner(System.in);
        System.out.print("Enter your numbers: ");
        String user = num.nextLine();
        char [] result = user.toCharArray();
        for (int a=0; a<7; a++) {
            for (char b : result) {
                switch (b) {
                    case '1': {
                        System.out.print(m_1[a]);
                        break;
                    }
                    case '2': {
                        System.out.print(m_2[a]);
                        break;
                    }
                    case '3': {
                        System.out.print(m_3[a]);
                        break;
                    }
                    case '4': {
                        System.out.print(m_4[a]);
                        break;
                    }
                    case '5': {
                        System.out.print(m_5[a]);
                        break;
                    }
                    case '6': {
                        System.out.print(m_6[a]);
                        break;
                    }
                    case '7': {
                        System.out.print(m_7[a]);
                        break;
                    }
                    case '8': {
                        System.out.print(m_8[a]);
                        break;
                    }
                    case '9': {
                        System.out.print(m_9[a]);
                        break;
                    }
                    case '0': {
                        System.out.print(m_0[a]);
                        break;
                    }
                }
            }
            System.out.println("\n");
        }
    }
}
