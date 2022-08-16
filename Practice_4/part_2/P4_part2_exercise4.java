/*4. El astrónomo Metón de Atenas descubrió hacia el siglo V a.C que la luna
repite su ciclo cada 19 años (el mismo día del mismo mes tendrá la misma
fase lunar). Sus aportes permitieron determinar la fase de la luna para una
fecha dada. Los pasos para obtener esa información son:
a. Calcular el número áureo: permite conocer en qué año-tipo del ciclo
nos encontramos considerando la repetición de ciclos cada 19 años.
El número áureo se calcula de la siguiente forma:
– Tomamos la cifra del año que nos interesa (por ejemplo 2023) y le sumamos 1
(2023+1=2024)
– A continuación dividimos el resultado por 19 (ciclo de repetición) y nos
quedamos con el resto 2024/19 = 106 resto = 10 (10 es el resto entre 2024 y 19). Al
dividir por 19 hemos eliminado los ciclos repetidos. Así el número áureo es 10.
b. Calcular la epacta: es la edad de la luna en días el 1 de enero del
año elegido, y se calcula de la siguiente forma:
– Se resta 1 del número áureo, y se multiplica por 11 (en nuestro caso 10-1 = 9; 9*11
= 99)
– Después, se divide por 30 (un mes lunar) y de nuevo nos quedamos con el resto:
99/30 = 3 resto = 9. Significa que el 1 de enero de 2023 habrán pasado 9 días
desde la última luna nueva.

26

Práctico

c. Finalmente, para saber la edad lunar en un día cualquiera,
(supongamos el 15 de junio de 2023) realizaremos la siguiente
operación:
1) A la epacta (9) le sumamos 1 por cada mes a partir de marzo (por
ejemplo: de marzo a junio sumamos 4, y si el mes fuera enero de
marzo a enero sumamos 11), y luego le sumamos el día del mes
requerido (15), es decir 9+4+15=28.
2) 28 es la edad lunar para esa fecha, y si pasara de 29 habría que
reducirlo obteniendo el resto de dividir por 30.
3) Es decir que el 15 de junio de 2023 habrán pasado 28 días desde la
última luna nueva, por lo que la luna será menguante casi nueva (a
falta de un día aproximadamente).

Se pide: hacer un programa completo en el cual se solicite de teclado el
ingreso de un día, un número de mes, y un año; luego calcule la cantidad
de días desde la última luna nueva (edad lunar), e informe por pantalla en
cual de las 4 fases se corresponde para esa fecha (ver cálculo en ejercicios
resueltos p4e4.xlsx).*/

/*4. The astronomer Meton of Athens discovered around the 5th century BC that 
the moon repeats its cycle every 19 years (the same day of the same month will 
have the same lunar phase). His contributions made it possible to determine the 
phase of the moon for a given date. The steps to obtain that information are:
1. Calculate the golden number: it allows us to know in which year-type of the 
cycle we are considering the repetition of cycles every 19 years.
The golden ratio is calculated as follows:
– We take the number of the year that interests us (for example 2023) and add 1
(2023+1=2024)
– Next we divide the result by 19 (repetition cycle) and we are left 
with the remainder 2024/19 = 106 remainder = 10 (10 is the remainder between 2024 and 19). 
To the dividing by 19 we have eliminated the repeated cycles. So the golden number is 10.
2. Calculate the epact: it is the age of the moon in days on January 1 of the chosen year,
 and is calculated as follows:
– Subtract 1 from the golden ratio, and multiply by 11 (in our case 10-1 = 9; 9*11
= 99)
– Then, it is divided by 30 (a lunar month) and again we keep the rest:
99/30 = 3 remainder = 9. It means that on January 1, 2023, 9 days will 
have passed since the last new moon.

26

Practical
3. Finally, to know the lunar age on any given day,
(assume June 15, 2023) we will perform the following operation:
1) To epact (9) we add 1 for each month from March (for example: from March 
to June we add 4, and if the month were January from March to January we add 11),
 and then we add the day of month required (15), that is 9+4+15=28.
2) 28 is the lunar age for that date, and if it exceeds 29, it would have 
to be reduced by obtaining the remainder of dividing by 30.
3) In other words, on June 15, 2023, 28 days will have passed since the 
last new moon, so the moon will be waning almost new (approximately one day to go).

It is required: to make a complete program in which the entry of a day, 
a month number, and a year is requested from the keyboard; then calculate
 the number of days since the last new moon (moon age), and report on the 
 screen which of the 4 phases it corresponds to for that date 
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P4_part2_exercise4 {
  public static void main(String[] args) {
    int day, month, year, goldenNum, epacta, moonAge, differenceMonth;
    try{
      BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter a day number");
      day = Integer.valueOf(entry.readLine());
      System.out.println("Enter a month number");
      month = Integer.valueOf(entry.readLine());
      System.out.println("Enter a year number");
      year = Integer.valueOf(entry.readLine());
      
      //calculate golden number
      goldenNum = (year + 1) % 19;
      
      //calculate epacta
      epacta = ((goldenNum - 1) * 11) % 30;
      
      //calculate moon age in days
      differenceMonth = (month - 2);
      
      if(differenceMonth == -1 || differenceMonth == -2){
        switch(differenceMonth){
          case -1:{
            differenceMonth = 11;
            break;
          }
          case -2:{
            differenceMonth = 10;
            break;
          }
        }
      }
      /*
      
      If not also and with less code:also and with less code:
      if((month >= 3) && (month <= 12)){
          sum_month = month - 2;
      } 
      else{
          sum_month = month + 10;
      }
      */
      
      moonAge = epacta + differenceMonth + day;
      
      if(moonAge > 29){
        moonAge = moonAge % 30;
      }
      
      //print
      System.out.println("That is to say that the day "+ day +" of the month "+ month +" of "+ year +" "+ moonAge +" days will have passed since the last new moon, so the moon will be in the stage:");
      if (moonAge < 7) {
        System.out.println("The lunar phase is NEW MOON");
      } else if (moonAge < 15){
        System.out.println("The lunar phase is FIRST QUARTER");
      } else if (moonAge < 22){
        System.out.println("The lunar phase is FULL MOON");
      } else if (moonAge < 29){
        System.out.println("The lunar phase is LAST QUARTER");
      }  
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}