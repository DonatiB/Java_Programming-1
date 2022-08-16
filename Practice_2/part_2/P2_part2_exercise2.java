/*2. Escribir un programa que solicite los siguientes datos de una persona (nombre,
apellido, edad, altura, ocupación, dirección) y los imprima por pantalla.*/
/*2. Write a program that requests the following data from a person 
(name, surname, age, height, occupation, address) and prints them on the screen*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2_part2_exercise2 {
  public static void main(String[] args) {
    String name, lastName, domicile, occupation;
    int age;
    double height;
    
    try{
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter your name: ");
      name = entrada.readLine();
      System.out.println("Enter your lastName: ");
      lastName = entrada.readLine();
      System.out.println("Enter your domicile: ");
      domicile = entrada.readLine();
      System.out.println("Enter your occupation: ");
      occupation = entrada.readLine();
      System.out.println("Enter your age: ");
      age = Integer.valueOf(entrada.readLine());
      System.out.println("Enter your height: ");
      height = Double.valueOf(entrada.readLine());
      
      System.out.println("\fThe entered data is");
      System.out.println("Name: " + name);
      System.out.println("lastName: " + lastName);
      System.out.println("Domicile: " + domicile);
      System.out.println("Occupation: " + occupation);
      System.out.println("Age: " + age);
      System.out.println("Height: " + height);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
    
    
  }
}