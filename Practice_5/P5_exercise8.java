/*8. Escribir un programa que mientras que el usuario ingrese un caracter letra
minúscula, pida ingresar un numero entero. Si el número ingresado está
entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho
numero.*/
/*8. Write a program that while the user enters a lowercase letter character, 
asks to enter an integer. If the number entered is between 1 and 5 inclusive,
 you must print the multiplication table of said number.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
class P5_exercise8 {
  public static void main(String[] args) {
    char character;
    int num;
    final int MAX = 5;
    final int MIN = 1;
    final int MAXMULTIPLIER = 10;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter a lowercase letter character(another to go out) ");
      character = entry.readLine().charAt(0);
      while((character >= 'a') && (character <= 'z')){
        System.out.println("Enter an integer: ");
        num = Integer.valueOf(entry.readLine());
        if((num >= MIN) && (num <= MAX)){
          System.out.println("Multiplication table of 8 de "+num);
          for(int multiplier = 0; multiplier <= MAXMULTIPLIER; multiplier++){
            System.out.println(num+" * "+multiplier+" = "+num*multiplier);
          }
        }
        System.out.println("Enter a lowercase letter character(another to go out): ");
      	character = entry.readLine().charAt(0);
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}