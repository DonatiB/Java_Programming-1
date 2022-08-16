/*5. Escribir un programa que mientras que el usuario ingrese un número entero
entre 1 y 10 inclusive, lleve la suma de los números ingresados. Finalmente,
cuando sale del ciclo muestre por pantalla el resultado de la suma.*/

/*5. Write a program that while the user enters an
 integer between 1 and 10 inclusive, takes the sum 
 of the numbers entered. Finally, when it exits the 
 loop, display the result of the sum on the screen.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P5_exercise5 {
  public static void main(String[] args) {
    int num;
    int sum = 0;
    final int MAX = 10;
    final int MIN = 1;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter an integer between 1 and 10 inclusive(other to go out): ");
      num = Integer.valueOf(entry.readLine());
      while((num >= MIN) && (num <= MAX)){
        sum = sum + num;
        System.out.println("Enter an integer between 1 and 10 inclusive(other to go out): ");
        num = Integer.valueOf(entry.readLine());   
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
    System.out.println("Sum total of all entered values: "+sum);
  }
}