/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niit.lab1.task2;

public class Program
{
   public static void main(String[] args)
   {
      double val=Double.parseDouble(args[0]);
      double delta=Double.parseDouble(args[1]);
      Sqrt sqrt=new Sqrt(val, delta);
      double result=sqrt.calc();
      System.out.println("Sqrt of "+val+"="+result);
   }
   
}