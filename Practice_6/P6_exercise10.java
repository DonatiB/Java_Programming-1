/*10. Escribir un programa que mientras el usuario ingrese un número entero
entre 1 y 10, pida ingresar un caracter, y por cada caracter ingresado
imprima:
– “letra minúscula” si el caracter es una letra del abecedario en minúscula;
– “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
– “dígito” si el caracter corresponde a un carácter número;
– “otro” para los restantes casos de caracteres.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P6_exercise10 {
  public static final int MINVALUE = 1;
  public static final int MAXVALUE = 10;
  public static void main(String[] args) {
    int num;
    char character;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter an integer between 1 and 10(other to go out): ");
      num = Integer.valueOf(entry.readLine());
      while((num >= MINVALUE)&&(num <= MAXVALUE)){
        System.out.println("Enter a character: ");
        character = entry.readLine().charAt(0);
        print_character_type(character);
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
}
