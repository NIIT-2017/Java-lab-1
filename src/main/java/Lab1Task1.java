class Colatz{
    private int colatz, max_colatz;
    public int evenUneven (int value){
        if ((value % 2) == 1)
            return 0; //uneven value
        else
            return 1; //even value
    }
    public int getColatz(int value){
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
    public int getMax_colatz(int left, int right){
        int result=0;
        max_colatz=0;
        for (int i = left; i <= right; i++) {
            if (this.getColatz(i) > max_colatz) {
                max_colatz = this.getColatz(i);
                result = i;
            }
        }
        return result;
    }
}
public class Lab1Task1 {
    public static void main(String[] args) {
        Colatz colatz = new Colatz();
        int min_limit, max_limit, result;
        min_limit=1;
        max_limit=1000000;
        result=colatz.getMax_colatz(min_limit, max_limit);
        System.out.println(result);
    }
}
