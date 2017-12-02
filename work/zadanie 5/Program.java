import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	String[][] num = new String[10][7];
	
	num[0][0]="  ***   "; 
	num[0][1]=" *   *  "; 
	num[0][2]="*     * "; 
	num[0][3]="*     * "; 
	num[0][4]="*     * "; 
	num[0][5]=" *   *  "; 
	num[0][6]="  ***   ";
	
	num[1][0]=" *  ";
	num[1][1]="**  ";
	num[1][2]=" *  ";
	num[1][3]=" *  ";
	num[1][4]=" *  ";
	num[1][5]=" *  ";
	num[1][6]="*** ";
	
	num[2][0]=" ***  ";
	num[2][1]="*   * ";
	num[2][2]="*  *  ";
	num[2][3]="  *   ";
	num[2][4]=" *    ";
	num[2][5]="*     ";
	num[2][6]="***** ";
	
	num[3][0]=" ***  ";
	num[3][1]="*   * ";
	num[3][2]="    * ";
	num[3][3]="  **  ";
	num[3][4]="    * ";
	num[3][5]="*   * ";
	num[3][6]=" ***  ";
	
	num[4][0]="   *   ";
	num[4][1]="  **   ";
	num[4][2]=" * *   ";
	num[4][3]="*  *   ";
	num[4][4]="****** ";
	num[4][5]="   *   ";
	num[4][6]="   *   ";
	
	num[5][0]="****  ";
	num[5][1]="*     ";
	num[5][2]="***   ";
	num[5][3]="   *  ";
	num[5][4]="    * ";
	num[5][5]="   *  ";
	num[5][6]="***   ";
	
	num[6][0]="*     ";
	num[6][1]="*     ";
	num[6][2]="*     ";
	num[6][3]="****  ";
	num[6][4]="*   * ";
	num[6][5]="*   * ";
	num[6][6]="****  ";
	
	num[7][0]="***** ";
	num[7][1]="    * ";
	num[7][2]="   *  ";
	num[7][3]="  *   ";
	num[7][4]=" *    ";
	num[7][5]="*     ";
	num[7][6]="*     ";
	
	num[8][0]=" ***  ";
	num[8][1]="*   * ";
	num[8][2]="*   * ";
	num[8][3]=" ***  ";
	num[8][4]="*   * ";
	num[8][5]="*   * ";
	num[8][6]=" ***  ";
	
	num[9][0]=" **** ";
	num[9][1]="*   * ";
	num[9][2]="*   * ";
	num[9][3]=" **** ";
	num[9][4]="    * ";
	num[9][5]="    * ";
	num[9][6]="    * ";
	
	String w = Integer.toString(x);
    char[] charArray = w.toCharArray();
		for (int j=0;j<=6;j++) {
			for (int i = 0;i<charArray.length;i++) {
				int c = Character.getNumericValue(charArray[i]);
		System.out.print(num[c][j]);
		
		
		}
			System.out.println();
		}
		}

}