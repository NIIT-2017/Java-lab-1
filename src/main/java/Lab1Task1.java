class Colatz{
    private int left,right;
    Colatz(int left, int right){
        this.left=left;
        this.right=right;
    }
    int evenUneven (int value){
        if ((value % 2) == 1)
            return 0; //uneven value
        else
            return 1; //even value
    }
    int colatz(int value){
        int count=0;
        while (value>1) {
            if (evenUneven(value) == 1)
                value = value / 2;
            else
                value = value * 3 + 1;
            count++;
        }
        return count;
    }
    int maxColatz(){
        int result=0;
        int max_colatz=0;
        for (int i = this.left; i <= this.right; i++) {
            if (this.colatz(i) > max_colatz) {
                max_colatz = this.colatz(i);
                result = i;
            }
        }
        return result;
    }
}
public class Lab1Task1 {
    public int maxCollatz (String[] args){
        int left = Integer.parseInt(args[0]);
        int right = Integer.parseInt(args[1]);
        Colatz colatz = new Colatz(left,right);
        return colatz.maxColatz();
    }
    public static void main(String[] args) {
        Lab1Task1 task1 = new Lab1Task1();
        args = new String[]{"1", "1000000"};
        System.out.println(task1.maxCollatz(args));
    }
}
