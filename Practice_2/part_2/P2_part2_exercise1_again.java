/* Escribir un programa que solicite y luego muestre por consola los valores
necesarios para dibujar un círculo y un triángulo. Hay que determinar en cada
caso que constantes (que no se cargan por consola) y variables con tipos son
necesarias declarar. */
/*1. Write a program that requests and then displays on the console the values 
needed to draw a circle and a triangle. It is necessary to determine in each case 
which constants  (which are not loaded by the console) and variables with 
types are necessary to declare.
From a few values entered by the user, perform the calculations 
so that you have all the necessary values*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P2_part2_exercise1_again {
    public static void main(String[] args) {
        double radio;
        final double pi = 3.14159265358979323846;
        double side1, side2, angle;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            // valores para dibujar un circulo
            System.out.println("Enter the radius:");
            radio = Double.valueOf(entrada.readLine());
            System.out.println("The values needed to draw a circle are radio = " + radio + " y pi = " + pi);
            //valores para dibujar un triangulo
            System.out.println("Enter the side 1");
            side1 = Double.valueOf(entrada.readLine());
            System.out.println("Enter the side 2:");
            side2 = Double.valueOf(entrada.readLine());
            System.out.println("Enter the angle");
            angle = Double.valueOf(entrada.readLine());
            System.out.println("The values needed to draw a triangle are side 1 = " + side1 + ", side 2 = " + side2 + " y el ángle = " + angle);
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}