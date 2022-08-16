/*3. Construir un programa que solicite desde teclado un número de
mes y posteriormente notifique por pantalla la cantidad de días
de ese mes. En el caso de que ingrese 2 como número de mes
(febrero), para imprimir la cantidad de días deberá solicitar
ingresar un número de anio (no usar ñ), para determinar si es
bisiesto o no con la siguiente sentencia:
_si ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) es verdadero,
entonces es bisiesto.*/

/*3. Cree un programa que solicite un número de mes desde el teclado
y luego notifique el número de días de ese mes en la pantalla. 
En caso de que ingrese 2 como número de mes (febrero), para imprimir la cantidad de días
debe solicitar ingresar un número de año (no use ñ), para determinar si es bisiesto o no 
con la siguiente afirmación :
_si ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) es cierto, entonces es un año 
bisiesto.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4_part2_exercise3 {
  public static void main(String[] args) {
  	int month;
    int year;
    try{
      BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter a month number: ");
      month = Integer.valueOf(entry.readLine());
      switch(month){
        case 1:{
          System.out.println("January has 31 days");
          break;
        }
        case 2:{
          System.out.println("Enter a year number: ");
     	  year = Integer.valueOf(entry.readLine());
          if(((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))){
            System.out.println("Febrero bisiesto has 29 days");
          }else{
            System.out.println("February has 28 days");
          }
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
          System.out.println("Octuber has 31 days");
          break;
        }
        case 11:{
          System.out.println("November has 30 days");
          break;
        }
        case 12:{
          System.out.println("December has 31 days");
          break;
        }
        default:{
          if(month <= 0 || month >=13){
            System.out.println("The number " + month + " does not belong to a month number");
          }
        }
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}