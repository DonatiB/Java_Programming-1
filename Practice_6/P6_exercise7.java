/*7. Escribir un programa que mientras el usuario ingresa un numero de mes
(entero) entre 1 y 12 inclusive, muestre por pantalla la cantidad de días del
mes ingresado (suponer febrero de 28 días) (¿mostrar por pantalla la
cantidad de días del mes debería realizarse con un método? Debería).*/ 

/*7. Escriba un programa que mientras el usuario ingresa un número de mes 
(entero) entre 1 y 12 inclusive, muestre en pantalla el número de días 
del mes ingresado (suponga que febrero tiene 28 días) 
(muestre en pantalla el número de días del mes mes debería hacerse con un método? Debería).*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P6_exercise7 {
  public static void main(String[] args) {
    int month;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter a month number: ");
      month = Integer.valueOf(entry.readLine());
      while((month >= 1)&&(month <= 12)){
        print_amount_days_x_month(month);
         System.out.println("Enter a month number: ");
         month = Integer.valueOf(entry.readLine());
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
    
  }
  public static void print_amount_days_x_month(int month){
    switch(month){
      case 1:{
        System.out.println("January has 31 days");
        break;
      }
      case 2:{
        System.out.println("Februray has 28 days");
        break;
      }
      case 3:{
        System.out.println("March has 31 days");
        break;
      }
      case 4:{
        System.out.println("April has 30 days");
        break;
      }
      case 5:{
        System.out.println("May has 31 days");
        break;
      }
      case 6:{
        System.out.println("June has 30 days");
        break;
      }
      case 7:{
        System.out.println("July has 31 days");
        break;
      }
      case 8:{
        System.out.println("August has 31 days");
        break;
      }
      case 9:{
        System.out.println("September has 30 days");
        break;
      }
      case 10:{
        System.out.println("October has 31 days");
        break;
      }
      case 11:{
        System.out.println("November tiene 30 days");
        break;
      }
      case 12:{
        System.out.println("December tiene 31 days");
        break;
      }
    }
  }
}