public class Task5 {
    public static void main (String[] args){
        String numbers = args[0];
        String[] result = makeLine(numbers);
        for (int i=0; i < result.length; i++) {
            if (i == result.length - 1)
                System.out.print(result[i]);
            else
                System.out.println(result[i]);
        }
    }
    public static String[] makeLine (String numbers){
        char arr[]=numbers.toCharArray();
        String[] result = new String [7];
        String[] one = {" * ", "** ", " * ", " * ", " * ", " * ", "***"};
        String[] two = {" *** ", "*   *", "*  * ", "  *  ", " *   ", "*    ", "*****"};
        String[] three = {" *** ", "    *", "    *", " *** ", "    *", "    *", " *** "};
        String[] four = {"   *  ", "  **  ", " * *  ", "*  *  ", "******", "   *  ", "   *  "};
        String[] five = {"*****", "*    ", "*    ", " *** ", "    *", "    *", "**** "};
        String[] six = {"*    ", "*    ", "*    ", "**** ", "*   *", "*   *", "**** "};
        String[] seven = {"*****", "    *", "   * ", "  *  ", " *   ", "*    ", "*    "};
        String[] eight = {" *** ", "*   *", "*   *", " *** ", "*   *", "*   *", " *** "};
        String[] nine = {" ****", "*   *", "*   *", " ****", "    *", "    *", "    *"};
        String[] zero = {"  ***  ", " *   * ", "*     *", "*     *", "*     *"," *   * ", "  ***  "};
        String raw;
        for(int i=0;i<result.length;i++){
            raw="";
            for(int j=0; j<numbers.length();j++){
                switch(arr[j]){
                    case '1':
                        raw+=one[i]+"  ";
                        break;
                    case '2':
                        raw+=two[i]+"  ";
                        break;
                    case '3':
                        raw+=three[i]+"  ";
                        break;
                    case '4':
                        raw+=four[i]+"  ";
                        break;
                    case '5':
                        raw+=five[i]+"  ";
                        break;
                    case '6':
                        raw+=six[i]+"  ";
                        break;
                    case '7':
                        raw+=seven[i]+"  ";
                        break;
                    case '8':
                        raw+=eight[i]+"  ";
                        break;
                    case '9':
                        raw+=nine[i]+"  ";
                        break;
                    case '0':
                        raw+=zero[i]+"  ";
                        break;
                }
                result[i] = raw;
            }
        }
        return result;
        }
    }
