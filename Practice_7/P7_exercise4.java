/*4. Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y lo agregue al principio del arreglo
(posición 0). Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor
del arreglo) y colocar el numero en el arreglo en la posición indicada.*/

/*4. Write a program that, given a preloaded array of integers of size 10, 
prompts the user for an integer and adds it to the beginning of the array 
(position 0). To do this you will have to perform a shift to the right 
(the last value of the array is lost) and place the number in the array 
in the indicated position.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P7_exercise4 {
  public static final int MAX = 10;
  public static final int MAXVALUE = 10;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
    int [] arrint = new int [MAX];
    int num;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      load_random_array_int(arrint);
      print_integer_array(arrint);
      System.out.println("Enter an integer: ");
      num = Integer.valueOf(entry.readLine());
      right_shift(arrint, num);
      print_integer_array(arrint);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static void right_shift(int [] arr, int num){
    //I do the shift to the right losing the last value of the array
    for(int i = MAX-1; i > 0; i--){
      arr[i] = arr[i-1];
    }
    //I add the user number to position 0
    arr[0] = num;
  }
  
  public static void load_random_array_int(int [] arr){
    Random r = new Random();
    for (int pos = 0; pos < MAX; pos++){
    	arr[pos]=(r.nextInt(MAXVALUE-MINVALUE+1) + MINVALUE);
    }
  }
  
  public static void print_integer_array(int [] arr){
    for (int pos = 0; pos < MAX; pos++){
    	System.out.println("name_array["+pos+"]=>: "+arr[pos]);
    }
  }
}