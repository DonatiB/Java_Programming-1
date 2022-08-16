/*8. Escribir un programa que mientras que el usuario ingrese un caracter letra
minúscula, pida ingresar un numero entero. Si el número ingresado está
entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho
numero.*/

/*8. Write a program that while the user enters a 
lowercase letter character, asks to enter an integer. 
If the number entered is between 1 and 5 inclusive, 
you must print the multiplication table of said number.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P6_exercise8 {
  public static final int MAXMULTIPLIER = 10;
  public static final int MINMULTIPLIER = 1;
  public static void main(String[] args) {
    char character;
    int num;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter a lowercase letter character: ");
      character = entry.readLine().charAt(0);
      while((character >= 'a')&&(character <= 'z')){
        System.out.println("Enter an integer: ");
        num = Integer.valueOf(entry.readLine());
        if((num >= 1)&&(num <= 5)){
          print_multiplication_table(num);
        }
        System.out.println("Enter a lowercase letter character: ");
        character = entry.readLine().charAt(0);
      }
    }catch(Exception exc){
      System.out.println(exc);
    }
  }
  public static void print_multiplication_table(int num){
    for(int multiplier = MINMULTIPLIER; multiplier <= MAXMULTIPLIER; multiplier++){
      System.out.println(num+"*"+multiplier+"="+num*multiplier);
    }
  }
}