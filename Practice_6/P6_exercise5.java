/*5. Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ‘*’, invoque a un método que imprima si es caracter dígito o
caracter letra minúscula, y si es letra minúscula imprimir si es vocal o
consonante.*/

/*5. Write a program that while the user enters a character other than the
 '*' character, calls a method that prints if it is a digit character or a 
 lowercase letter character, and if it is a lowercase letter, prints if it 
 is a vowel or a consonant.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class P6_exercise5 {
  public static void main(String[] args) {
    char character;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter a character(* to go out): ");
      character = entry.readLine().charAt(0);
      while(character != '*'){
        print_character(character);
        System.out.println("Enter a character(* to go out): ");
      	character = entry.readLine().charAt(0);
      }
    }
    catch(Exception exc){
        System.out.println(exc);
    }
  }
  public static void print_character(char character){
    if((character >= '0')&&(character <= '9')){
      	System.out.println("Character "+character+" is digit");
    }else if((character >= 'a')&&(character <= 'z')){
        System.out.println("Character "+character+" is lowercase letter");
        if((character == 'a')||(character == 'e')||(character == 'i')||(character == 'o')||(character == 'u')){
          System.out.println("Character "+character+" is vowel");
        }else{
          System.out.println("Character "+character+" is consonant");
        }
    }
    
    //or also
    
    if((character >= 'a')&&(character <= 'z')){
      System.out.println(character+" is lowercase letter");
      switch(character){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':{
          System.out.println(character+" is vowel");
          break;
        }
        default:{
          System.out.println(character+" is consonant");
        }
      }  
    }
    else if((character >= '0')&&(character <= '9')){
      	System.out.println(character+" is digit");
    }
  }
}
