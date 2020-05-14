public class Task4 {
    public static void main(String[] args) {
        String t =args[0];
        //String t = "1,2,3,4,5,8,11,12,13,14,18,20,26,27,28,29";
        String g = "";
        g = closed(t);
        System.out.println(g);
    }
    public static String closed(String t) {
        String g = "";
        String str[] = t.split(",");
        for (int i=0; i < str.length; i++) {
            int j=0;
            while( i+j< str.length && Integer.parseInt(str[i])+j == Integer.parseInt(str[i+j]) ) {
                j++;
            }
            j--;
            if (j>1){
                g = g.concat(str[i]+"-"+str[i+j] + ",");
                i+=j;
            }
            else {
                g = g.concat(str[i] + ",");
            }
        }
        g = g.substring(0, g.length() - 1);
        return g;
    }
}