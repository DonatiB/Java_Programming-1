/*3. Escribir un programa que mientras que el usuario ingrese un número entero
distinto de 0, pida ingresar otro número entero y lo imprima.*/

/*3. Write a program that while the user enters an integer other than 0, 
asks to enter another integer and prints it.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P5_exercise3 {
  public static void main(String[] args) {
    int num1, num2;
	  final int distinct = 0;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter an integer(0 to go out): ");
      num1 = Integer.valueOf(entry.readLine());
      while(num1 != distinct){
        System.out.println("Enter an integer:");
        num2 = Integer.valueOf(entry.readLine());
        System.out.println("Enter an other integer: "+num2);
        System.out.println("Enter an integer(0 to go out): ");
        num1 = Integer.valueOf(entry.readLine());
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}