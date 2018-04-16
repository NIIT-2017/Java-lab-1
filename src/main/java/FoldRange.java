public class FoldRange
{
    public static void foldRange(String str) {
        String strArr[] = str.split(",");
        int arr[] = new int[strArr.length];
        for(int j=0; j < arr.length; j++) arr[j] = Integer.parseInt(strArr[j]);
        for(int k=0; k < arr.length; k++) {
            int cur = k;
            while((k + 1 < arr.length) && (arr[k+1] - arr[k] == 1)) k++;
            System.out.print(arr[cur]);
            if (cur != k) System.out.print("-" + arr[k]);
            if (k != arr.length - 1) System.out.print(",");
        }
        System.out.println();
    }
}
