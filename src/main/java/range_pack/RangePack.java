package range_pack;

public class RangePack {

    public static String createString(String[] args){
        String[] arrStr = args[0].split(",");
        String s = arrStr[0];
        boolean inRange = false;
        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++)
            arrInt[i] = Integer.parseInt(arrStr[i]);
        for (int i=2; i<arrInt.length; i++) {
            if ((arrInt[i-1] - arrInt[i-2]) == 1 && (arrInt[i] - arrInt[i-1]) == 1) {
                inRange = true;
            }
            else if (inRange){
                s =s + "-"+arrInt[i-1];
                inRange = false;
            }
            else {
                s = s + ","+arrInt[i-1];
            }
        }
        if (inRange){
            s = s+"-"+arrInt[arrInt.length-1];
        }
        else {
            s = s+","+arrInt[arrInt.length-1];
        }
        return s;
    }

    public static void main(String[] args) {

        System.out.print(createString(args));
    }
}
