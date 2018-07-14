import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TaskFour {

	static String compress(String arg){
        ArrayList<Integer> arrayList = new ArrayList<>(new ArrayList<String>(

                Arrays.asList(arg.split(","))).stream().map(

                e -> Integer.parseInt(e)

        ).collect(Collectors.toList()));

        StringBuilder holder = new StringBuilder(Integer.toString(arrayList.get(0)));
        System.out.println(arrayList);
        for(int i = 1; arrayList.size() > i; i++) {
            int start = arrayList.get(i - 1);
            int end = arrayList.get(i);

            if(start == end - 1) {

                holder.append("-" + Integer.toString(end));
            }
            else {
                holder.append("," + Integer.toString(arrayList.get(i)));
            }

        }

        StringBuilder result = new StringBuilder();
        for(String s : holder.toString().split(",")) {

            String[] ss = s.split("-");
            if(ss.length == 1){
                result.append(ss[0]);
                result.append(",");
            }
            else if(Integer.parseInt(ss[0]) + 1 == Integer.parseInt(ss[ss.length - 1])) {
                result.append(ss[0] + ",");
                result.append(ss[ss.length - 1]);
                result.append(",");
            }
            else {
                result.append(ss[0] + "-");
                result.append(ss[ss.length - 1]);
                result.append(",");
            }

        }
        result.setLength(result.length() - 1);
        System.out.println(result);
        return result.toString();

    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println(compress(args[0]));

	}
}
