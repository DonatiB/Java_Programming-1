/*1. Escribir un programa que mientras el usuario ingrese un número entero
menor que 10 y mayor a 1, muestre por pantalla si el número es múltiplo de
2 y múltiplo de 3 simultáneamente. (¿Los valores mencionados en el
enunciado deberían ser constantes?. De a poco habría que definirlos
como constantes).*/

/*1. Write a program that while the user enters an integer less than 10 
and greater than 1, displays on the screen if the number is a multiple 
of 2 and a multiple of 3 simultaneously. (Should the values mentioned in 
the statement be constants? Little by little they should be defined as constants).*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P5_exercise1 {
  public static void main(String[] args) {
    int num;
    final int MAX = 10;
    final int MIN = 1;
    final int MULTIPLE2 = 2;
    final int MULTIPLE3 = 3;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("enter a number less than "+MAX+" and greater than "+MIN+", another to go out");
      num = Integer.valueOf(entry.readLine());
      while((num<MAX) && (num>MIN)){
		if(((num % MULTIPLE2)==0)&&((num % MULTIPLE3)==0)){
          System.out.println(num+" its multiple of 2 and 3");
        }
        /*place it below because before the while the user enters a number 
        (that meets the condition, and that number passes through the filter of whether 
        it is a multiple or not) besides that when putting it down if a number 
        like 30 (which is a multiple of 2 and 3 but is not less than 10,
        it will go through that filter, because the number n would be first and 
        then the filter of if it is a multiple, it would print it, and then it would just exit the 
        iteration there, so that it is not printed (because it is not less than 10,
        place the filter before the number is entered)*/
        System.out.println("enter a number less than "+MAX+" and greater than "+MIN+", another to go out");
      	num = Integer.valueOf(entry.readLine());
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}