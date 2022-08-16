/*4. Escribir un programa que mientras que el usuario ingrese un caracter dígito
o caracter letra minúscula, imprima si es caracter dígito o caracter letra
minúscula, y si es letra minúscula imprimir si es vocal o consonante.*/

/*4. Write a program that while the user enters 
a digit character or lowercase letter character, 
prints if it is a digit character or lowercase letter character, 
and if it is a lowercase letter prints if it is a vowel or consonant.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P5_exercise4 {
  public static void main(String[] args) {
    char character;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter a digit character or lowercase vowel character(other to go out): ");
      character = entry.readLine().charAt(0);
      while(((character >= '1') && (character <= '9')) || ((character >= 'a') && (character <= 'z'))){
        if((character >= '1') && (character <= '9')){
          System.out.println(character +" its digit character");
        }
        else if((character >= 'a') && (character <= 'z')){
          System.out.println(character +" its lowercase vowel characterscula");
          if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
            System.out.println("its vowel");
          }else{
            System.out.println("its consonant");
          }
        }
        System.out.println("Enter a digit character or lowercase vowel character(other to go out): ");
        character = entry.readLine().charAt(0);
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}