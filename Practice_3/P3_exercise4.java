
/*4. Escribir un programa que ingrese un número entero por teclado e
imprima los resultados de determinar:
_ el número es múltiplo de 6 y de 7,
_ el número es mayor a 30 y múltiplo de 2, o es menor igual a 30,
_ el cociente de la división de dicho número con 5 es mayor a 10.*/

/*4. Write a program that enters an integer from the keyboard and prints the results of determining:
_ the number is a multiple of 6 and 7,
_ the number is greater than 30 and a multiple of 2, or is less than 30,
_ the quotient of the division of said number with 5 is greater than 10.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3_exercise4 {
  public static void main(String[] args) {
    int num;
    boolean result;
    try{
      //the user enters an integer by keyboard
      BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter an integer:");
      num = Integer.valueOf(entry.readLine());
      
      //the number is a multiple of 6 and 7
      result = (((num % 6)==0) && ((num % 7)==0));
      System.out.println("is the number a multiple of 6 and 7?: "+ result);
      //the number is greater than 30 and a multiple of 2, or is less than 30
      result = ((num > 30) &&((num % 2)==0)) || (num <= 30);
      System.out.println("is the number greater than 30 and a multiple of 2, or is less than 30: "+ result);
      //the quotient of the division of said number with 5 is greater than 10
      result = (num / 5) > 10;
      System.out.println("is the quotient of the division of said number with 5 greater than 10?: "+ result);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}
