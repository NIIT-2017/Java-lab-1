/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niit.lab1.task1;

public class CollatzLib {
    private int num, max;

    public long getNum() {
        return num;
    }
    
    int count = 0; 
    public void collatz(long n) {
//        System.out.print(n + " ");
        count++;
        if (n == 1) return;
        else if (n % 2 == 0) collatz(n / 2);
        else collatz(3*n + 1);        
    }
     
    public void findMaxCollatz(){
        for (int i = 1; i < 1_000_000; i++) {
            collatz(i);
//            System.out.println();
//            System.out.println(count);
            if(count >= max){
                max = count;
                num = i;
            }
//            if(count>=collatzMap.get("max")){
//                collatzMap.put("max", Long.valueOf(count));
//                collatzMap.put("num", Long.valueOf(i));
//            }
            count = 0;
        }
//        for (Map.Entry entry : collatzMap.entrySet()) {
//            System.out.println("Key: "      + entry.getKey() + 
//                               " Value: "   + entry.getValue());
//        }
        
        System.out.println("в числе "+num+" длина последовательности "+max);
    }

    public void print() {
        System.out.println("");
    }
    
}
