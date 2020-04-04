import java.util.Arrays; //uvi, bad primer, nado formirovat' vse chislo postrocno, vizivaya elements massiva
public class L1T5
{
    static String[] zero ={"\n  __ \n |  |\n |  |\n  -- "};
    static String[] one = {"\n---\n | \n | \n---"};
    static String[] two = {"\n____\n || \n || \n----"};
    static String[] three = {"\n_____\n ||| \n ||| \n-----"};
    static String[] four = {"\n  .  \n / | \n/__| \n   | "};
    static String[] five = {"\n| F -\n| I  \n  V |\n_ E |"};
    static String[] six =  {"\n.--.\n|__\n|  |\n|__|"};
    static String[] seven = {"\n____\n   /\n  | \n  | "};
    static String[] eight = {"\n8888\n8__8\n8  8\n8888"};
    static String[] nine = {"\n  N |\n__I |\n  N |\n__E_|"};
    public static void main(String[] args)
    {
        String[] input = {"6","4","7"};
        for(int i = 0; i < input.length; i++)
        {
            switch (input[i])
            {
                case "0":
                    System.out.print(Arrays.toString(zero));
                    break;
                case "1":
                    System.out.print(Arrays.toString(one));
                    break;
                case "2":
                    System.out.print(Arrays.toString(two));
                    break;
                case "3":
                    System.out.print(Arrays.toString(three));
                    break;
                case "4":
                    System.out.print(Arrays.toString(four));
                    break;
                case "5":
                    System.out.print(Arrays.toString(five));
                    break;
                case "6":
                    System.out.print(Arrays.toString(six));
                    break;
                case "7":
                    System.out.print(Arrays.toString(seven));
                    break;
                case "8":
                    System.out.print(Arrays.toString(eight));
                    break;
                case "9":
                    System.out.print(Arrays.toString(nine));
                    break;
            }
        }
    }
}