package niit.lab1.task5;

public class Numbers {
    static String[] num0 = new String[] {
            " ### ",
            " # # ",
            " # # ",
            " # # ",
            " # # ",
            " ### "
    };
    static String[] num1 = new String[] {
            "  #  ",
            " ##  ",
            "  #  ",
            "  #  ",
            "  #  ",
            " ### "
    };
    static String[] num2 = new String[] {
            " ### ",
            " # # ",
            "   # ",
            "  #  ",
            " #   ",
            " ### "
        };
    static String[] num3 = new String[] {
            " ### ",
            "   # ",
            "  ## ",
            "   # ",
            "   # ",
            " ### "
        };
    static String[] num4 = new String[] {
            " # # ",
            " # # ",
            " # # ",
            " ### ",
            "   # ",
            "   # "
        };
    static String[] num5 = new String[] {
            " ### ",
            " #   ",
            " ### ",
            "   # ",
            "   # ",
            " ### "
        };
    static String[] num6 = new String[] {
            "   # ",
            "  #  ",
            " ### ",
            " # # ",
            " # # ",
            " ### "
        };
    static String[] num7 = new String[] {
            " ### ",
            " # # ",
            "   # ",
            "   # ",
            "  #  ",
            " #   "
        };
    static String[] num8 = new String[] {
            " ### ",
            " # # ",
            "  #  ",
            " # # ",
            " # # ",
            " ### "
        };
    static String[] num9 = new String[] {
            " ### ",
            " # # ",
            " ### ",
            "   # ",
            "  #  ",
            " #   "
        };
        static StringBuilder line0 = new StringBuilder();
        static StringBuilder line1 = new StringBuilder();
        static StringBuilder line2 = new StringBuilder();
        static StringBuilder line3 = new StringBuilder();
        static StringBuilder line4 = new StringBuilder();
        static StringBuilder line5 = new StringBuilder();
    
    public static void main(String[] args) {
        print(617908L);
    }

    private static void print(long number) {
        String numbers = String.valueOf(number);
        for(int i=0;i<numbers.length();i++){
            switch(numbers.charAt(i)){
                case '0': printNumber(num0); break;
                case '1': printNumber(num1); break;
                case '2': printNumber(num2); break;
                case '3': printNumber(num3); break;
                case '4': printNumber(num4); break;
                case '5': printNumber(num5); break;
                case '6': printNumber(num6); break;
                case '7': printNumber(num7); break;
                case '8': printNumber(num8); break;
                case '9': printNumber(num9); break;
            }   
        }    

        System.out.println(line0.toString());
        System.out.println(line1.toString());
        System.out.println(line2.toString());
        System.out.println(line3.toString());
        System.out.println(line4.toString());
        System.out.println(line5.toString());
    }

    private static void printNumber(String[] num) {
        line0.append(num[0]);
        line1.append(num[1]);
        line2.append(num[2]);
        line3.append(num[3]);
        line4.append(num[4]);
        line5.append(num[5]);
    }
}
