/*12. Siguiendo la Clase 4 Ejercicio 4, hacer un programa completo (usando
métodos donde se requiera) en el cual se solicite de teclado el ingreso de
un día, un número de mes, y un año; luego calcule la cantidad de días
desde la última luna nueva (edad lunar), e informe por pantalla en cual de
las 4 fases se corresponde para esa fecha.*/

/*12. Following exercise 4 part 2 practice 4, make a complete program 
(using methods where required) in which the input of a day, 
a month number, and a year is requested from the keyboard; 
then calculate the number of days since the last new moon 
(moon age), and report on the screen in which of
the 4 phases correspond to that date.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
class P6_exercise12 {
  public static void main(String[] args) {
    int day, month, year, goldenNum, epacta, moonAge;
    String moonStage;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter a day number: ");
      day = Integer.valueOf(entry.readLine()); 
      System.out.println("Enter a month number: ");
      month = Integer.valueOf(entry.readLine());
      System.out.println("Enter a year: ");
      year = Integer.valueOf(entry.readLine());
      
      goldenNum = calculate_golden_number(year);
      epacta = calculate_epacta(goldenNum);
      moonAge = calculate_moon_age(epacta, day, month);
      
      System.out.println("On the "+day+"th day of the "+month+"th month dof the year "+year+", "+moonAge+" days will have passed since the last new moon");
      calculate_moon_stage(moonAge);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static int calculate_golden_number(int year){
    int goldenNum;
    goldenNum = (year+1)%19;
    return goldenNum;
  }
  
  public static int calculate_epacta(int goldenNum){
    int epacta;
    epacta = (((goldenNum - 1)*11)%30);
    return epacta;
  }
  
  public static int calculate_moon_age(int epacta, int day, int month){
    int moonAge, sum_month;
  	if((month >= 3)&&(month <= 12)){
      sum_month = month - 2;
    }else{
      sum_month = month + 10;
    }
    
    moonAge = epacta + sum_month + day;
    if(moonAge > 29){
      moonAge = moonAge % 30;
    }
    return moonAge;
  }
  
  public static void calculate_moon_stage(int moonAge){
    int moonStage;
    if(moonAge <= 7){
      System.out.println("the moon phase is NEW MOON");
    }else if(moonAge <= 14){
      System.out.println("the moon phase is FIRST QUARTER");
    }else if(moonAge <= 21){
      System.out.println("the moon phase is FULL MOON");
    }else if(moonAge <= 29){
      System.out.println("the moon phase is LAST QUARTER");
    }
  }
}
