/*1. Escribir un programa que solicite y luego muestre por consola los valores
necesarios para dibujar un círculo y un triángulo. Hay que determinar en cada
caso que constantes (que no se cargan por consola) y variables con tipos son
necesarias declarar.*/
/*1. Write a program that requests and then displays on the console the values 
needed to draw a circle and a triangle. It is necessary to determine in each case 
which constants  (which are not loaded by the console) and variables with 
types are necessary to declare.
From a few values entered by the user, perform the calculations 
so that you have all the necessary values*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
//library to use mathematical operations (in this case root and arcsine)
import java.util.*;
public class P2_part2_exercise1 {
  public static void main(String[] args) {
    //values to draw a circle
    final double pi = 3.141592;
    double radio, perimeter, area;
    
    //values to draw the triangle
    double cathetusA, cathetusO, angle, hypotenuse, hypotenuseSquared;
    
    try{
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      
      //data entry for the circle
      System.out.println("Enter the (real number): ");
      radio = Double.valueOf(entrada.readLine());
      
      //circle calculation
      perimeter = 2 * pi * radio;
      area = pi * radio*radio;
      
      //show circle values by console
      System.out.println("The values to draw a circle are: ");
      System.out.println("Pi: " + pi);
      System.out.println("Radio: " + radio);
      System.out.println("Perimeter: " + perimeter);
      System.out.println("Area: " + area);
      
      
      //ingreso de datos para el triangulo
      System.out.println("\f");
      System.out.println("Enter adjacent cathetus: ");
      cathetusA = Double.valueOf(entrada.readLine());
      System.out.println("Enter opposite cathetus: ");
      cathetusO = Double.valueOf(entrada.readLine());
      
      //data entry for the triangle
      hypotenuseSquared = (cathetusA * cathetusA) + (cathetusO * cathetusO);
      hypotenuse = Math.sqrt(hypotenuseSquared);
      
      angle = Math.asin(cathetusO / hypotenuse);
      
      //show triangle values by console
      System.out.println("Valores del Triangulo: ");
      System.out.println("cathetus Adjacent: " + cathetusA);
      System.out.println("cathetus Opposite: " + cathetusO);
      System.out.println("hypotenuse: " + hypotenuse);
      System.out.println("Angle: " + angle);
      
    }
    catch (Exception exc){
      System.out.println(exc);
    }
     
  }
}

