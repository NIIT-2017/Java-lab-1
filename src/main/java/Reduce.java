public class Reduce {
    public String reduce(String str){
        String num = "";
        String[] numbers = str.split(",");
        int arr[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        int start = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1) {
                num += start;
                if (start == arr[i - 1]) {
                    num += ",";
                } else {
                    if (start != arr[i - 1] - 1) num += "-" + arr[i - 1] + ",";
                    else num += "," + arr[i - 1] + ",";
                }
                start = arr[i];
            }
            if (i == arr.length - 1) {
                if (arr[i] == arr[i - 1] + 1) {
                    if (start == arr[i] - 1) {
                        num += start + "," + arr[i];
                    } else num += start + "-" + arr[i];
                } else num += start + "-" + arr[i - 1] + "," + arr[i];
            }
        }
        return num;
    }
        public static void main(String[] args){
            String str = args[0];
            Reduce outputString = new Reduce();
            System.out.println(outputString.reduce(str));
        }
    }


