/*7. Escribir un programa que mientras el usuario ingrese un caracter letra
minúscula, se quede con la menor y la mayor letra ingresada. Finalmente
muestre por pantalla dichas letras.*/

/*7. Write a program that while the user enters a 
lowercase letter character, it keeps the smallest and 
the largest letter entered. Finally show these letters on the screen.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
class P5_exercise7 {
  public static void main(String[] args) {
    char character;
    char smaller = 'z';
    char larger  = 'a';
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter a lowercase letter character(another to go out): ");
      character = entry.readLine().charAt(0);
      while((character >= 'a')&&(character <= 'z')){
        if(character < smaller){
          smaller = character;
        }
        if(character > larger ){
          larger  =  character;
        }
        System.out.println("Enter a lowercase letter character(another to go out): ");
        character = entry.readLine().charAt(0);
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
    System.out.println("the larger letter entered was "+ larger +" and the smaller entered was "+smaller);
  }
}