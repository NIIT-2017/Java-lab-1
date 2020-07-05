class To_Roll {
    String ToRoll(String arg){

        String[] buffer = arg.split(",");
        int [] arr = new int [buffer.length];

        for (int i = 0; i < buffer.length; i++){
            arr [i]= Integer.parseInt(buffer[i]);
        }

        String str = " ";
        if ((arr[0]+1 == arr[0+1]) && (arr[0]+2 == arr[0+2])){
            str = "" + arr[0]+"-";
        }
        else str = "" + arr[0]+",";

        for (int i = 1; i < arr.length-1; i++){
            if (arr[i]-1 != arr[i-1]) {
                if ((arr[i] - 1 != arr[i - 1]) && (arr[i] + 1 == arr[i + 1]) && (arr[i] + 2 == arr[i + 2])){
                    str = str + arr[i] + "-";
                }
                else str = str + arr[i]+",";
            }
            if ((arr[i]-1 == arr[i-1]) && (arr[i]+1 != arr[i+1]))
                str = str + arr[i]+",";
        }
        str = str + arr[arr.length-1];
        return str;
    }
}

public class task4 {
    public static void main(String[] args) {
        String arr   = "1,2,4,5,6,7,18,19,20,21";
        To_Roll roll = new To_Roll();
        System.out.println (roll.ToRoll(arr));
    }
}
