/*3. Escribir un programa que ingrese un número entero por teclado y
realice:
_ imprima es múltiplo de 6 y de 7 si cumple con esa condición,
_ o imprima es mayor a 30 y múltiplo de 2 si cumple con esa
condición,
_ imprima si el cociente de la división de dicho número con 5 es
mayor a 10 sin importar las condiciones previas.*/

/*3. Write a program that enters an integer from the keyboard and performs:
_ print is a multiple of 6 and 7 if it meets that condition,
_ or print is greater than 30 and a multiple of 2 if it meets that condition,
_ print if the quotient of the division of said number with 5 is greater than 
10 regardless of the previous conditions.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4_part1_exercise3 {
  public static void main(String[] args) {
    int num;
    try{
      BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter an integer: ");
      num = Integer.valueOf(entry.readLine());
      
      if(((num % 6)==0) && ((num % 7)==0)){
        System.out.println("is a multiple of 6 and 7");
      }
      else if((num > 30)&&((num % 2)==0)){
        System.out.println("is greater than 30 and a multiple of 2");
      }
      
      if((num / 5) > 10){
        System.out.println("quotient of the division of said number with 5 is greater than 10 ");
      }   
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}