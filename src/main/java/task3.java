public class Task3 {
    public static void main(String[] args) {
        String range = args[0];
        System.out.println(range);
        String openedRange = openedRange(range);
        System.out.println(openedRange);
    }
    public static String openedRange (String range) {
        char arr[] = range.toCharArray();
        String openedRange = "";
        /* if symbol is not '-' print it. If it's '-' convert chars in left and in right to numbers.
        Use these numbers as begin and end of the loop and print everything between.
        To convert chars in left count digits starting from 0 and use formula: sum+=n*10^digit
        To convert chars in right at first count digits starting from 1. Then go back and use the same formula */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '-') {
                openedRange += String.valueOf(arr[i]);
            }
            else {
                int digit = 0;
                int number = 0;
                for (int j = i - 1; j >= 0 && arr[j] != ','; j--) {
                    number += (arr[j] - '0') * Math.pow(10, digit);
                    digit++;
                }
                int left = number;
                digit = 0;
                number = 0;
                for (int j = i + 1; j < arr.length && arr[j] != ','; j++) {
                    digit++;
                }
                for (int j = i + 1; j < arr.length && arr[j] != ','; j++) {
                    number += (arr[j] - '0') * Math.pow(10, digit - 1);
                    digit--;
                }
                int right = number;
                openedRange += ",";
                while (left + 1 < right) {
                    openedRange += String.valueOf(left + 1) + ",";
                    left++;
                }
            }
        }
        return openedRange;
    }
}
