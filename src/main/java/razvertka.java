public class razvertka {
    public static int[] zoom(String interval)
    {
        int[] chisla;
        String limits[] = interval.split("-");
        if (limits.length == 1)
        {
            chisla = new int[1];
            chisla [0] = Integer.parseInt(limits[0]);
        } else
        {
            int start = Integer.parseInt(limits[0]);
            int end = Integer.parseInt(limits[1]);
            chisla = new int[end - start + 1];
            for (int i = start; i <= end; i++)
                chisla[i - start] = i;
        }
        return chisla;
    }
    public static void main(String[] args)
    {
        String example = "1,2-8,10,11";
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
