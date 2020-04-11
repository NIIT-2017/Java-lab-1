public class L1T5
{
    static String[] zero ={"  __ ", "|  |", "|  |", " -- "};
    static String[] one = {" ---", " | ", " | ", " ---"};
    static String[] two = {" ____", " || ", " || ","----"};
    static String[] three = {" _____", " ||| ", " ||| ","-----"};
    static String[] four = {"   .  ", " / | ", "/__| ","   | "};
    static String[] five = {" | F -"," | I  ","  V |","_ E |"};
    static String[] six =  {" .--."," |__","|  |","|__|"};
    static String[] seven = {" ____", "  /", " | ","  | "};
    static String[] eight = {" 8888","8__8"," 8  8","8888"};
    static String[] nine = {"   N |","__I |", " N |","__E_|"};
    public static String getOutpotString(String number, int i)
    {
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<number.length(); j++)
        {
            if(number.charAt(j) == '0')
                sb.append(zero[i]);
            if(number.charAt(j) == '1')
                sb.append(one[i]);
            if(number.charAt(j) == '2')
                sb.append(two[i]);
            if(number.charAt(j) == '3')
                sb.append(three[i]);
            if(number.charAt(j) == '4')
                sb.append(four[i]);
            if(number.charAt(j) == '5')
                sb.append(five[i]);
            if(number.charAt(j) == '6')
                sb.append(six[i]);
            if(number.charAt(j) == '7')
                sb.append(seven[i]);
            if(number.charAt(j) == '8')
                sb.append(eight[i]);
            if(number.charAt(j) == '9')
                sb.append(nine[i]);
        }
        String result = sb.toString();
        return result;
    }
    public static void main(String[] args)
    {
        if(args.length == 0)
            return;
        for(int i = 0; i<one.length; i++)
        {
            System.out.println(getOutpotString(args[0], i));//vivod N-noi stroki
        }
    }
}
