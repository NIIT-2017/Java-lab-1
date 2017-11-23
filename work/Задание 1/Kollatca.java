import java.util.Scanner;

public class Kollatca {
	public static void main(String[] args) {
		int y=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Введите число:");
		int x = s.nextInt();
		for(;;) {
			if(x==1){
	        	break;
	        	} else if (x%2==0) {
				x=x/2;
				y++;
				System.out.println(y + " число = " + x);
				continue;
			} else if (x%2!=0) {
        	x=x*3+1;
			y++;
			System.out.println(y + " число = " + x);
        	}
			
		}
		System.out.println("Последовательность числа Коллатца = " + y);
	}
}
