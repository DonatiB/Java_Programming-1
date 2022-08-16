/*1. Escribir un programa que permita el ingreso de un carácter y realice:
_ imprima es carácter dígito si el carácter ingresado es carácter
dígito,
_ o imprima no es carácter dígito*/

/*1. Write a program that allows input of a character and performs:
_ print "is digit character" if the character entered is a digit character,
_ or print "is not digit character"*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4_part1_exercise1 {
  public static void main(String[] args) {
    char character;
    try{
      BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter a character: ");
      character = entry.readLine().charAt(0);
      if (('0'<=character)&&(character<='9')) {
	  	System.out.println("It's digit character");
      }
      else {
        System.out.println("It's not a digit character");
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}

