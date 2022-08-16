/*6. Escribir un programa que mientras el usuario ingrese un caracter letra
minúscula, acumule la cantidad de vocales que ingreso. Finalmente
muestre por pantalla dicha cantidad.*/

/*Write a program that while the user enters a lowercase letter character,
accumulates the number of vowels entered. Finally, display that amount on the screen.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
class P5_exercise6 {
  public static void main(String[] args) {
    char character = 0;
    int amount = 0;;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter a lowercase letter character(other to go out): ");
       character = entry.readLine().charAt(0);
      while((character >= 'a') && (character <= 'z')){
        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
          amount++;
        }
        System.out.println("Enter a lowercase letter character(other to go out): ");
        character = entry.readLine().charAt(0);
      }
    }
    catch(Exception exc){
      
    }
    System.out.println("the number of vowels entered are: " + amount);
  }
}