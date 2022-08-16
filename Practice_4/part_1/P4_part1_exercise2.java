/*2. Escribir un programa que permita el ingreso de dos números enteros
por teclado y realice:
_ imprima A si el primero mayor al segundo,
_ o imprima B si ambos son múltiplos de 2,
_ o imprima C para ninguna de las opciones anteriores*/

/*2. Write a program that allows the input of two integers by keyboard and performs:
_ print A if the first is greater than the second,
_ or print B if both are multiples of 2,
_ or print C for none of the above */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4_part1_exercise2 {
  public static void main(String[] args) {
    int num1, num2;
    try{
      BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter an integer: ");
      num1 = Integer.valueOf(entry.readLine());
      System.out.println("Enter an other integer: ");
      num2 = Integer.valueOf(entry.readLine());
      if(num1 > num2){
        System.out.println("A");
      }
      else if(((num1 % 2) ==0) && ((num2 % 2) ==0)){
        System.out.println("B");
      }
      else{
        System.out.println("C");
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}