/*6. Escribir un programa que mientras que el usuario ingrese un número entero
natural, llame a un método que calcule la sumatoria entre 1 y dicho
numero y se lo retorne como resultado.*/

/*6. Write a program that while the user enters a natural integer, 
calls a method that calculates the sum between 1 and said number 
and returns it as a result.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
class P6_exercise6 {
  public static void main(String[] args) {
     int natural_num, sum;
     BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
     try{
       System.out.println("Enter an natural integer number: ");
       natural_num = Integer.valueOf(entry.readLine());
       while(natural_num > 0){
         sum = calculate_sum(natural_num);
         System.out.println("The sum between 1 and " + natural_num + " is = " + sum);
         System.out.println("Enter a natural integer number(other to go out: ");
         natural_num = Integer.valueOf(entry.readLine());
       }
     }
     catch(Exception exc){
      System.out.println(exc);
     }
  }
  public static int calculate_sum(int num){
    int sum = 0;
    int i = 1;
    while(i <= num){
      sum = sum + i;
      //sum += i;
      i++;
    }
    return sum;
  }
}
