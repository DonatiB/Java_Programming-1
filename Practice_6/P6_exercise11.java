/*11. Escribir un programa que mientras el usuario ingrese un número entero
entre 1 y 10 realice:
– Si el numero ingresado es múltiplo de 3 pida ingresar un caracter, y para el caracter
ingresado imprima a que tipo de carácter esta asociado:
• “letra minúscula” si el caracter es una letra del abecedario en minúscula;
• “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
• “dígito” si el caracter corresponde a un carácter número;
• “otro” para los restantes casos de caracteres.
– Si el numero ingresado es múltiplo de 5 imprima la tabla de multiplicar del numero
ingresado.*/

/*11. Write a program that while the user enters an integer between 1 and 10 performs:
– If the number entered is a multiple of 3, ask to enter a character, and for the entered character, print what type of character it is associated with:
• “lowercase letter” if the character is a lowercase letter of the alphabet;
• “uppercase letter” if the character is an uppercase letter of the alphabet;
• “digit” if the character corresponds to a number character;
• “other” for the remaining cases of characters.
– If the number entered is a multiple of 5, print the multiplication table of the number entered.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
class P6_exercise11 {
  public static final int MINVALUE = 1;
  public static final int MAXVALUE = 10;
  public static final int MINMULTIPLIER = 1;
  public static final int MAXMULTIPLIER = 10;
  public static void main(String[] args) {
    int num;
    char character;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter an integer between 1 and 10(other to go out): ");
      num = Integer.valueOf(entry.readLine());
      while((num >= MINVALUE)&&(num <= MAXVALUE)){
        if((num % 3)==0){
          System.out.println("Enter a character: ");
          character = entry.readLine().charAt(0);
          print_character_type(character);
        }else if((num % 5)==0){
          print_multiplication_table(num);
        }
        System.out.println("Enter an integer between 1 and 10(other to go out): ");
      	num = Integer.valueOf(entry.readLine());
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  public static void print_character_type(char character){
    if((character >= 'a')&&(character <= 'z')){
      System.out.println("lowercase letter");
    }else if((character >= 'A')&&(character <= 'Z')){
      System.out.println("uppercase letter");
    }else if((character >= '0')&&(character <= '9')){
      System.out.println("dígit");
    }else{
      System.out.println("other");
    }
  }
  public static void print_multiplication_table(int num){
    for(int multiplier = MINMULTIPLIER; multiplier <= MAXMULTIPLIER; multiplier++){
      System.out.println(num+"*"+multiplier+"="+ (num*multiplier));
    }
  }
}
