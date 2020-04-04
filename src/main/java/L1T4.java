public class L1T4
{
    public static void main(String[] args)
    {
        int[] numbers;
        String input = "4,10,11,12,13,100,18,19,20,21";
        String[] arr = input.split(",");
        numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            numbers[i] = Integer.parseInt(arr[i]);
        for (int i = 0; i < numbers.length - 3; i++)//split?
        {
            System.out.print(numbers[i]);
            if (numbers[i] == numbers[i + 1] - 1 && numbers[i + 1] == numbers[i + 2] - 1)
            {
                while (i < numbers.length-1 && numbers[i] == numbers[i + 1]-1)
                    i++;
                System.out.print("-" + numbers[i]);
                if (i < numbers.length - 1)
                    System.out.print(",");
            }
            else
                System.out.print(",");
        }
    }
}