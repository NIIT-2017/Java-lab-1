import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String x = s.next();
		
	    char[] charArray = x.toCharArray();
	    ArrayList<String> list = new ArrayList<String>();
	    
	    
	    for (int i=0; i<charArray.length-1;i++) {
	    int c = Character.getNumericValue(charArray[i]);
	    int[] f = new int[charArray.length];
	    list.add(Integer.toString(c));
	    String y = list.toString();
	    f[i]=c;
	    int idx = list.indexOf(c);
	    if ( y == "-") {
	    	
	    		int e = f[i+2]-f[i];
	    		for (int z = 0;z<e;z++) {
	    		int t = f[i]+1;
	    		for (int r =i;r<charArray.length + (e*2);r++) {
	    			String[] q = new String[charArray.length + e];
	    			q[r] = t+",";
	    			System.out.println(q[r]);
	    		}
	    		
	    		

	    	    
	    		}
	    	
	    }
	    
	    }
	    System.out.println(charArray[1]);
	    System.out.println(list);
	}

}
