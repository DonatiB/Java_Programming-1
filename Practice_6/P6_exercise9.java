/*9. Escribir un programa para el Ejemplo 10.*/
/*Realizar un programa que dado dos números enteros y un
carácter, todos ingresados por el usuario, muestre por
pantalla el resultado de la operación matemática básica
considerando el valor del carácter. Si ingreso el caracter:
– ‘a’ la suma, ‘b’ la resta, ‘c’ la multiplicación y ‘d’ la división
entre ambos números.*/

/*9. Write a program for Example 10.*/
/*Make a program that given two integers and a
character, all entered by the user, show by
display the result of the basic mathematical operation
considering the value of character. If I enter the character:
– ‘a’ addition, ‘b’ subtraction, ‘c’ multiplication and ‘d’ division
between both numbers.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P6_exercise9 {
  public static void main(String[] args) {
    int num1, num2;
    char character;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter an integer: ");
      num1 = Integer.valueOf(entry.readLine());
      System.out.println("Enter an other integer: ");
      num2 = Integer.valueOf(entry.readLine());
      System.out.println("Enter a character,‘a’ addition, ‘b’ subtraction, ‘c’ multiplicatión y ‘d’ división: ");
      character = entry.readLine().charAt(0);
      basic_math_operations(character, num1, num2);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  public static void basic_math_operations(char option, int num1, int num2){
    switch(option){
      case 'a':{
        System.out.println(num1+"+"+num2+"="+ (num1 + num2));
        break;
      }
      case 'b':{
        System.out.println(num1+"-"+num2+"="+ (num1 - num2));
        break;
      }
      case 'c':{
        System.out.println(num1+"*"+num2+"="+ (num1 * num2));
        break;
      }
      case 'd':{
        System.out.println(num1+"/"+num2+"="+ (num1 / num2));
        break;
      }
      default:{
        System.out.println("The entered character is not associated with any mathematical operation.");
      }
    }
  }
}
