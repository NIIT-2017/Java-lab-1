import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class ConvolutionNumber {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
        String s = args[0];
        String Result = res(s);
        System.out.print(Result);
    }

    static String res(String s){

        int[] numArr = Arrays.stream(s.split(",")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numArr);
        List<String> List = new ArrayList<>();
        for (int i = 0; i < numArr.length; i++) {
            int current = numArr[i];
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(current));
            int count = 1;
            int Index = i;
            int end = i;
            while (Next(Index, numArr)) {
                Index++;
                count++;
                if (count > 2)

                    end = Index;

                }
                if (count > 2) {

                    stringBuilder.append("-");
                    stringBuilder.append(String.valueOf(numArr[end]));
                }



            List.add(stringBuilder.toString());
            i = end;
        }
        String result = String.join(",", List);
              return result;
    }

    private static boolean Next(int Index, int[] array) {
        int current = array[Index];
        if (Index+1 == array.length) return false;
        int next = array[Index + 1];
        return (next - current == 1);
    }
}