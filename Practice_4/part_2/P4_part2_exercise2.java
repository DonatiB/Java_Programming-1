/*2. Hacer un programa que solicite la carga desde consola de
un carácter y realice: imprima si es dígito, o letra minúscula, o
es cualquier otro carácter. Si es letra minúscula indicar si es
vocal o consonante.*/

/*2. Make a program that requests the loading of a character from the 
console and performs: print if it is a digit, or lowercase letter, or any other character. 
If it is a lowercase letter, indicate if it is a vowel or a consonant.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4_part2_exercise2 {
  public static void main(String[] args) {
    char character;
    try{
      BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter a character: ");
      character = entry.readLine().charAt(0);
      
      if(('0' <= character) && (character <= '9')){
        System.out.println("it is digit");
      }
      else if(('a' <= character) && (character <= 'z')){
        System.out.println("is lowercase");
        if(character == 'a'|| character =='e'|| character =='i'|| character =='o'|| character =='u'){
			System.out.println("is vowel");
        }
        else{
        	System.out.println("is consonant");
        }
      }
      else{
        System.out.println("character is not a digit or lowercase");
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}
