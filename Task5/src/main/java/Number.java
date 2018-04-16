
public class Number {

    public static void main(String []args) throws Exception {
        String stringFromUser;
        stringFromUser = args[0];
        if (args.length == 0)
            throw new Exception("You should enter any number!");
        //  PrintStars starNums=new PrintStars(args[0]);

          methodNew(stringFromUser);
    }


    public static void methodNew(String someString) {
        String arrayOfNums[][];
        arrayOfNums = new String[10][];

        arrayOfNums[0] = new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
        arrayOfNums[1] = new String[]{
                "    *",
                "   **",
                "  * *",
                " *  *",
                "    *",
                "    *",
                "    *",
                "    *"
        };
        arrayOfNums[2] = new String[]{
                " *** ",
                "*   *",
                "    *",
                "   * ",
                "  *  ",
                " *   ",
                "*    ",
                "*****"
        };
        arrayOfNums[3] = new String[]{
                "**** ",
                "   *",
                "   *",
                "**** ",
                "   *",
                "   *",
                "   *",
                "**** "
        };
        arrayOfNums[4] = new String[]{
                "   * ",
                "  * *",
                " *  *",
                "*   *",
                "*****",
                "    *",
                "    *",
                "    *"
        };
        arrayOfNums[5] = new String[]{
                "*****",
                "*    ",
                "*    ",
                "**** ",
                "    *",
                "    *",
                "    *",
                "**** "
        };
        arrayOfNums[6] = new String[]{
                " *** ",
                "*   *",
                "*    ",
                "**** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
        arrayOfNums[7] = new String[]{
                "*****",
                "    *",
                "    *",
                "   * ",
                " *   ",
                " *   ",
                " *   ",
                " *   ",
        };
        arrayOfNums[8] = new String[]{
                " *** ",
                "*   *",
                "*   *",
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
        arrayOfNums[9] = new String[]{
                " *** ",
                "*   *",
                "*   *",
                " ****",
                "    *",
                "   * ",
                "  *  ",
                " *   ",
        };


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < someString.length(); j++) {
                //преобразуем String в char,парсим введенную строку, получаем int из charArr, далее обращаемся к массиву по индексу [number][i]
                char[] charArr = someString.toCharArray();
                int number = Character.getNumericValue(charArr[j]);
                System.out.print(arrayOfNums[number][i] + "  ");
            }
            System.out.println();

        }

    }



}







