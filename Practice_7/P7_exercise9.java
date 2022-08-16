/*9. Hacer un programa que dado un arreglo de enteros de tamaño 10 que se
encuentra precargado, solicite al usuario el ingreso de dos números
enteros (posiciones del arreglo) y ordene de forma creciente el arreglo
entre dos posiciones correspondientes a los números ingresados.*/

/*9. Write a program that, given an array of integers of size 10 that is preloaded,
asks the user to enter two integers (positions of the array) and ordered the array 
between two positions corresponding to the numbers entered in growing order.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class P7_exercise9 {
  public static final int MAX = 10;
  public static final int MAXVALUE = 10;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
    int [] arrint = new int [MAX];
    int num1, num2;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      random_load_array_int(arrint);
      print_integer_array(arrint);
      System.out.println("Enter an integer between 0 and 9: ");
      num1 = Integer.valueOf(entry.readLine());
      System.out.println("Enter an other integer between 0 and 9: ");
      num2 = Integer.valueOf(entry.readLine());
      ord_arr_bubbling_between_pos(arrint, num1, num2);
      print_integer_array(arrint);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
 
  public static void ord_arr_bubbling_between_pos(int[] arr, int startPos, int endPos){
    int temp;
    for(int i = startPos + 1;i < endPos;i++){
      for (int j = startPos ; j < endPos; j++){
        if (arr[j] > arr[j+1]){
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
      	}
      }
  	}
  }
  
  public static void random_load_array_int(int [] arr){
    Random r = new Random();
    for(int pos = 0; pos < MAX; pos++){
      arr[pos] =(r.nextInt(MAXVALUE-MINVALUE+1) + MINVALUE);
    }
  }
  
  public static void print_integer_array(int [] array) {
    for (int i = 0; i < MAX; i++) {
      System.out.print("[" + array[i] + "]");
    }
    System.out.println(" ");
  }
}
