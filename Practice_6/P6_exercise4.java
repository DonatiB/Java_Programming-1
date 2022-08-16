/*4. Escribir un programa que mientras el usuario cargue desde
teclado un numero entero distinto de 0, imprima por
pantalla la suma que se obtiene de invocar un método
que calcula la sumatoria de los primeros 200 números
naturales (son números enteros en 1 y 200).*/

/*4. Write a program that while the user loads from the keyboard an integer other than 0, prints by
display the sum obtained from invoking a method
which calculates the sum of the first 200 numbers
natural (they are integers in 1 and 200).*/

//import libraries
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6_exercise4 {
  public static void main(String[] args) {
    /*
    define number
        define summation
        get by keyboard integer (0 to exit)
        as long as number is different from 0
            sum equal to what the method 'calculate sum 1 to 200' returns
            print summation
    */
    int num;
    int sum;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter an integer(0 to go out): ");
      num = Integer.valueOf(entry.readLine());
      while(num != 0){
        sum = calculate_sum_1_200();
        System.out.println(sum);
        System.out.println("Enter an integer(0 to go out): ");
        num = Integer.valueOf(entry.readLine());
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  /*
  int method calculate sum 1 to 200()
        define sum equal to 0
        set adder equal to 1
        while adder equal to or less than 200
            sum equals sum + adder
        return sum
  */
   public static int calculate_sum_1_200(){
     final int MIN = 1;
     final int MAX = 200;
     int sum = 0;
     for(int adder = MIN; adder <= MAX; adder++){
       sum = sum + adder;
     }
     return sum;
   }
}