import com.chars.perform.CharPerform;
import static dev.gord.out.Output.*;

public class CharDigit implements CharPerform {
    public String performCharDigit(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String str: arr) {
            sb.append(str);
            sb.append('\n');
        }
        //sb.deleteCharAt(sb.length() - 1);
        sb.append('\n');
        return sb.toString();
    }

    public String outCharDigit(String value) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < value.length(); i++) {
            switch (Character.getNumericValue(value.charAt(i))) {
                case 0:
                    sb.append(performCharDigit(ZERO));
                    break;
                case 1:
                    sb.append(performCharDigit(ONE));
                    break;
                case 2:
                    sb.append(performCharDigit(TWO));
                    break;
                case 3:
                    sb.append(performCharDigit(THREE));
                    break;
                case 4:
                    sb.append(performCharDigit(FOUR));
                    break;
                case 5:
                    sb.append(performCharDigit(FIVE));
                    break;
                case 6:
                    sb.append(performCharDigit(SIX));
                    break;
                case 7:
                    sb.append(performCharDigit(SEVEN));
                    break;
                case 8:
                    sb.append(performCharDigit(EIGHT));
                    break;
                case 9:
                    sb.append(performCharDigit(NINE));
                    break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        CharDigit cd = new CharDigit();
        String res = cd.outCharDigit(args[0]);
        print(res);
    }
}
