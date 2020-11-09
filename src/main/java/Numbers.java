import java.util.ArrayList;

class Numbers {
   private String[] buf = new String[100];
   private String str="";
   private String total="";
   private ArrayList<Integer> list = new ArrayList<>();
   private ArrayList<String> list2 = new ArrayList<>();
   private String a="";
   private String b="";
    public String wrapping(String[] args) {
        int j = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-")) {
                buf[j] = args[i - 1];
                j++;
                buf[j] = args[i + 1];
                j++;
            }
        }
        try {
            int a = Integer.parseInt(buf[0]);
            int b = Integer.parseInt(buf[0 + 1]);
            for (int k = 0; a + 1 <= b; a++, k++) {
                list.add(a + 1);
            }
        } catch (NumberFormatException e) { }
        return this.list.toString();
    }
    public  String delete(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-")) break;
            str = args[i];
            list2.add(str);
        }
        return this.list2.toString();
    }

    public String addingString(String[] args) {
        Numbers numbers = new Numbers();
        String a  = numbers.wrapping(args);
        String b = numbers.delete(args);
        total = b + a;
        return this.total.replace("[","").replace("]"," ").replace(", "," ");
    }
}
class Task_03
{
    public static void main(String[]args)
    {
      String [] arguments ={"1","2","3","4","5","-","15"};
       Numbers numbers = new Numbers();
       String result = numbers.addingString(arguments);
       System.out.println(result);
    }
}
