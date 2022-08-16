/*2. Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ‘*’, muestre por pantalla si es caracter digito, o si es caracter
vocal minúscula.*/

/*2. Write a program that while the user enters a character 
other than the character '*', shows on the screen
if it is a digit character, or if it is a lowercase vowel character.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P5_exercise2 {
  public static void main(String[] args) {
    char character;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter a character(* to go out):");
      character = entry.readLine().charAt(0);
      while(character != '*'){
         if((character >= '1')&&(character <= '9')){
           System.out.println(character +" is character digit");
         }
         else if((character >= 'a')&&(character <= 'z')){
           System.out.println(character +" is a lowercase vowel character");
         }
         System.out.println("Enter a character(* to go out):");
     	 character = entry.readLine().charAt(0);
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}