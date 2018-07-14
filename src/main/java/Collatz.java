public class Collatz {


	public static int formula(long n) {
		if(n == 1) {
			return 1;
		}
		else if(n % 2 == 0) {
			return 1 + formula(n / 2);
		}
		else {
			return 1 + formula(3 * n + 1);
		}
	}

	public static int findBiggestChain(int sequence){
		int[] counter = new int[++sequence];
		int number = 0;
		for(int i = 1; i < sequence; i++){
			long n = i;
			counter[i] = formula(n);
			System.out.println("Step: " + i);
		}
		int max = Integer.MIN_VALUE;
		for(int i = 1; i < counter.length; i++){
			if(max < counter[i]){
				max = counter[i];
				number = i;
			}
		}
		System.out.println("Number is " + number + " Chain size is " + max);
		return number;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findBiggestChain(1000000);
	}
	


}
