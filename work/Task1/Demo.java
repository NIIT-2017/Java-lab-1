public class Demo {
    public static void main(String[] args)
    {
        MaxKollatz p=new MaxKollatz(1,1000000);  // 100000 - работает 1000000 - нет
        p.searchMax();
        System.out.println(p.getMaxValue());
        System.out.println(p.getMaxLength());
    }
}
