public class L1T3v2
{
    public static int[] zoom(String interval)
    {
        int[] counter;
        String limits[] = interval.split("-");
        if (limits.length == 1)
        {
            counter = new int[1];
            counter[0] = Integer.parseInt(limits[0]);
        } else
        {
            int start = Integer.parseInt(limits[0]);
            int end = Integer.parseInt(limits[1]);
            counter = new int[end - start + 1];
            for (int i = start; i <= end; i++)
                counter[i - start] = i;
        }
        return counter;
    }
    public static void main(String[] args)//drevnie massivi?
    {
        String example = "1,4-7,16-20";
        String arr[] = example.split(",");
        for (int i = 0; i < arr.length; i++)
        {
            int[] numbers = zoom(arr[i]);
            for (int j = 0; j < numbers.length; j++)
            {
                if (i == arr.length - 1 && j == numbers.length - 1)
                    System.out.print(numbers[j]);
                else
                    System.out.print(numbers[j] + ",");
            }
        }
    }
}
