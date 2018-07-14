import java.util.ArrayList;


public class TaskThree {

	static ArrayList<Integer> expand(String args){
		String[] s = args.split(",");
		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 0; s.length > i; i++) {
			if(s[i].contains("-")) {
				int n = 1;
				String[] holder = s[i].split("-");

				int start = Integer.parseInt(holder[0]);
				int end = Integer.parseInt(holder[1]);
				result.add(start);
				while (start + n < end) {
					result.add(start + n++);
				}
				result.add(end);
			}
			else {
				result.add(Integer.parseInt(s[i]));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> result = expand(args[0]);

		System.out.println(result);
		
	}
	

}
