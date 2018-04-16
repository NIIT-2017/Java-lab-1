public class DeployRange
{
    public static void deployRange(String str) {
        String strArr[] = str.split(",");
        int arr[] = new int[1000];
        int j=0, cur, count;
        for(int i=0; i < strArr.length; i++) {
            cur = j;
            for (String val: strArr[i].split("-")) arr[j++] = Integer.parseInt(val);
            if (i > 0) System.out.print(",");
            System.out.print(arr[cur]);
            if(j - cur == 2) {
                count = arr[j-1] - arr[cur];
                for(int k=1; k <= count; k++) {
                    arr[cur + k] = arr[cur] + k;
                    System.out.print("," + arr[cur+k]);
                }
                j = cur + count + 1;
            }
        }
        System.out.println();
    }
}