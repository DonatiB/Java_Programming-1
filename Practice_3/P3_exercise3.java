/*3. Escribir un programa que permita el ingreso de dos números enteros por
teclado e imprima los resultados de comparar:
_ el primero mayor al segundo.
_ ambos son múltiplos de 2.*/

/*3. Write a program that allows the input of two integers by keyboard and prints the results of comparing:
_ the first greater than the second.
_ both are multiples of 2.*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3_exercise3 {
  public static void main(String[] args) {
    int num1, num2;
    boolean result;
    try{
      //Keyboard input of 2 integers
      BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter an integer:");
      num1 = Integer.valueOf(entry.readLine());
      System.out.println("Enter an other integer:");
      num2 = Integer.valueOf(entry.readLine());
      
      //the first greater than the second.
      result = num1 > num2;
      System.out.println("Is the first greater than the second?: " + result);
      //both are multiples of 2
      result = (((num1 % 2)==0) &&((num2 % 2)==0));
      System.out.println("Are both multiples of 2?: " + result);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
    
  }
}
