/*1. Escribir un programa que para los tipos int, double, char y boolean
declare una variable en cada caso, luego asigne un valor a cada
una correspondiente al tipo que la variable tiene, e imprima por
pantalla cada una de las variables.*/
/*1. Write a program that for the types int, double, char and boolean declares 
a variable in each case, then assigns a value to each corresponding to the type 
that the variable has, and prints each of the variables on the screen.*/

public class P2_part1_exercise1 {
  public static void main(String[] args) {
    int age;
    double height;
    char initialLetter;
    boolean exist;
    
    age = 29;
    height = 1.75;
    initialLetter = 'B';
    exist = true;
    
    System.out.println("The age is: " + age);
    System.out.println("The height is: " + height);
    System.out.println("the initial letter of the name is: " + initialLetter);
    System.out.println("Exist: " + exist);
  }
}