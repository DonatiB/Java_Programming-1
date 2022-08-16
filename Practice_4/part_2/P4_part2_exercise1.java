/*1. Hacer un programa que solicite la carga desde consola de un
numero entero y realice:
_si el numero es positivo, imprima “grande” si es mayor a 100 o “chico “ si
es menor. Además deberá imprimir que el valor es positivo.
_si no lo es, imprima si el numero es par, o si el numero es múltiplo de 3, o
ninguna de las opciones anteriores.*/

/*1. Make a program that requests the loading from the console of an 
integer and performs:
_if the number is positive, print “large” if it is greater than 100 or “small” if it is less. It should also print that the value is positive.
_if not, print if the number is even, or if the number is a multiple of 3, or none of the above.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4_part2_exercise1 {
  public static void main(String[] args) {
    int num;
    try{
      BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter an integer: ");
      num = Integer.valueOf(entry.readLine());
      if(num > 0){
        if(num > 100){
          System.out.println("great");
        }
        else{
          System.out.println("small");
        }
        System.out.println("the value is positive");
      }
      else{
		if((num % 2) ==0){
          System.out.println("the number is even");
        }
        else if((num % 3)==0){
          System.out.println("the number is a multiple of 3");
        }
        else{
          System.out.println("the number is not even or multiple of 3");
        }
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
    
    
  }
}
