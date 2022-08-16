/*1. Escribir un programa que permita el ingreso de un número entero por
teclado e imprima el cociente de la división de dicho número con el
número 2, luego con el número 3, y finalmente con el número 4.*/
/*1. Write a program that allows the input of an integer by keyboard 
and prints the quotient of the division of said number 
with the number 2, then with the number 3, and finally with the number 4.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3_exercise1 {
  public static void main(String[] args) {
    int num, result;
    try{
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter an integer:");
      num = Integer.valueOf(entrada.readLine());
      result = num/2;
      System.out.println("The quotient of the division of " + num + " multiplied by 2 is: " + result);
      result = num/3;
      System.out.println("The quotient of the division of " + num + " multiplied by 3 is: " + result);
      result = num/4;
      System.out.println("The quotient of the division of " + num + " multiplied by 4 is: " + result);
      
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}