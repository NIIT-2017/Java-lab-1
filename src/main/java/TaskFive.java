import java.util.HashMap;
import java.util.Map;

public class TaskFive {

    static Map<Character, String[][]> numbers;


    static String[][] zero = {
            {" ", "*", "*", "*", " "},
            {" ", "*", " ", "*", " "},
            {" ", "*", " ", "*", " "},
            {" ", "*", " ", "*", " "},
            {" ", "*", " ", "*", " "},
            {" ", "*", "*", "*", " "}
    };

    static String[][] one = {
            {" ", " ", "*", " ", " "},
            {" ", "*", "*", " ", " "},
            {" ", " ", "*", " ", " "},
            {" ", " ", "*", " ", " "},
            {" ", " ", "*", " ", " "},
            {" ", "*", "*", "*", " "}
    };

    static String[][] two = {
            {" ", "*", "*", "*", " "},
            {" ", " ", " ", "*", " "},
            {" ", " ", "*", " ", " "},
            {" ", "*", " ", " ", " "},
            {" ", "*", " ", " ", " "},
            {" ", "*", "*", "*", " "}
    };
    static String[][] three = {
            {" ", "*", "*", "*", " "},
            {" ", " ", " ", "*", " "},
            {" ", "*", "*", "*", " "},
            {" ", " ", " ", "*", " "},
            {" ", " ", " ", "*", " "},
            {" ", "*", "*", "*", " "}
    };
    static String[][] four = {
            {" ", "*", " ", "*", " "},
            {" ", "*", " ", "*", " "},
            {" ", "*", " ", "*", " "},
            {" ", "*", "*", "*", " "},
            {" ", " ", " ", "*", " "},
            {" ", " ", " ", "*", " "}
    };

    static String[][] five = {
            {" ", "*", "*", "*", " "},
            {" ", "*", " ", " ", " "},
            {" ", "*", "*", "*", " "},
            {" ", " ", " ", "*", " "},
            {" ", " ", " ", "*", " "},
            {" ", "*", "*", "*", " "}
    };
    static String[][] six = {
            {" ", "*", "*", "*", " "},
            {" ", "*", " ", " ", " "},
            {" ", "*", "*", "*", " "},
            {" ", "*", " ", "*", " "},
            {" ", "*", " ", "*", " "},
            {" ", "*", "*", "*", " "}
    };

    static String[][] seven = {
            {" ", "*", "*", "*", " "},
            {" ", " ", " ", "*", " "},
            {" ", " ", "*", " ", " "},
            {" ", "*", " ", " ", " "},
            {" ", "*", " ", " ", " "},
            {" ", "*", " ", " ", " "}
    };

    static String[][] eight = {
            {" ", "*", "*", "*", " "},
            {" ", "*", " ", "*", " "},
            {" ", "*", "*", "*", " "},
            {" ", "*", " ", "*", " "},
            {" ", "*", " ", "*", " "},
            {" ", "*", "*", "*", " "}
    };

    static String[][] nine = {
            {" ", "*", "*", "*", " "},
            {" ", "*", " ", "*", " "},
            {" ", "*", "*", "*", " "},
            {" ", " ", " ", "*", " "},
            {" ", " ", " ", "*", " "},
            {" ", "*", "*", "*", " "}
    };
    static {
        numbers = new HashMap<>();
        numbers.put('0', zero);
        numbers.put('1', one);
        numbers.put('2', two);
        numbers.put('3', three);
        numbers.put('4', four);
        numbers.put('5', five);
        numbers.put('6', six);
        numbers.put('7', seven);
        numbers.put('8', eight);
        numbers.put('9', nine);
    }

    static void printNumbers(String arg){

        for(int i = 0; zero.length > i; i++){
            for(int k = 0; arg.length() > k; k++){
                for(int j = 0; zero[i].length > j; j++){

                    System.out.print(numbers.get(arg.charAt(k))[i][j]);

                }

            }
            System.out.println();

        }
    }


    public static void main(String args[]){
        printNumbers(args[0]);

    }
}
