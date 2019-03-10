import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

class Digits {
    public String[][][] Symbol = {
            {{"", "", "*", "*", "*", "", ""},
                    {"", "*", "", "", "", "*", ""},
                    {"*", "", "", "", "", "", "*"},
                    {"*", "", "", "", "", "", "*"},
                    {"*", "", "", "", "", "", "*"},
                    {"", "*", "", "", "", "*", ""},
                    {"", "", "*", "*", "*", "", ""}
            },
            {{"", "", "", "*", "", "", ""},
                    {"", "", "*", "*", "", "", ""},
                    {"", "", "", "*", "", "", ""},
                    {"", "", "", "*", "", "", ""},
                    {"", "", "", "*", "", "", ""},
                    {"", "", "", "*", "", "", ""},
                    {"", "", "*", "*", "*", "", ""}
            },
            {{"", "", "", "*", "*", "*", ""},
                    {"", "", "*", "", "", "", "*"},
                    {"", "", "*", "", "", "*", ""},
                    {"", "", "", "", "*", "", ""},
                    {"", "", "", "*", "", "", ""},
                    {"", "", "*", "", "", "", ""},
                    {"", "", "*", "*", "*", "*", "*"}
            },
            {{"", "", "", "*", "*", "*", ""},
                    {"", "", "", "", "", "", "*"},
                    {"", "", "", "", "", "", "*"},
                    {"", "", "", "*", "*", "*", ""},
                    {"", "", "", "", "", "", "*"},
                    {"", "", "", "", "", "", "*"},
                    {"", "", "", "*", "*", "*", ""}
            },
            {{"", "", "", "", "*", "", ""},
                    {"", "", "", "*", "*", "", ""},
                    {"", "", "*", "", "*", "", ""},
                    {"", "*", "", "", "*", "", ""},
                    {"", "*", "*", "*", "*", "*", "*"},
                    {"", "", "", "", "*", "", ""},
                    {"", "", "", "", "*", "", ""}
            },
            {{"", "", "*", "*", "*", "*", "*"},
                    {"", "", "*", "", "", "", ""},
                    {"", "", "", "*", "*", "*", ""},
                    {"", "", "", "", "", "", "*"},
                    {"", "", "", "", "", "", "*"},
                    {"", "", "*", "", "", "", "*"},
                    {"", "", "", "*", "*", "*", ""}
            },
            {{"", "", "*", "", "", "", ""},
                    {"", "", "*", "", "", "", ""},
                    {"", "", "*", "", "", "", ""},
                    {"", "", "*", "*", "*", "*", ""},
                    {"", "", "*", "", "", "", "*"},
                    {"", "", "*", "", "", "", "*"},
                    {"", "", "*", "*", "*", "*", ""}
            },
            {{"", "*", "*", "*", "*", "*", ""},
                    {"", "", "", "", "", "*", ""},
                    {"", "", "", "", "*", "", ""},
                    {"", "", "", "*", "", "", ""},
                    {"", "", "*", "", "", "", ""},
                    {"", "*", "", "", "", "", ""},
                    {"", "*", "", "", "", "", ""}
            },
            {{"", "", "", "*", "*", "*", ""},
                    {"", "", "*", "", "", "", "*"},
                    {"", "", "*", "", "", "", "*"},
                    {"", "", "", "*", "*", "*", ""},
                    {"", "", "*", "", "", "", "*"},
                    {"", "", "*", "", "", "", "*"},
                    {"", "", "", "*", "*", "*", ""}
            },
            {{"", "*", "*", "*", "*", "", ""},
                    {"*", "", "", "", "*", "", ""},
                    {"*", "", "", "", "*", "", ""},
                    {"", "*", "*", "*", "*", "", ""},
                    {"", "", "", "", "*", "", ""},
                    {"", "", "", "", "*", "", ""},
                    {"", "", "", "", "*", "", ""}
            }
    };
}

public class Task5 {
    static public void main(String args[]) {
        int[] digits;
        //String in=args[0];
        String in = "41072819";
        int n = in.length();
        digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = in.charAt(i) - '0';
        }
        Digits D = new Digits();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < n; j++)
                for (int k = 0; k < 7; k++)
                    if (D.Symbol[digits[j]][i][k] == "")
                        System.out.print(" ");
                    else
                        System.out.print(D.Symbol[digits[j]][i][k]);
            System.out.println("");
        }
    }
}
