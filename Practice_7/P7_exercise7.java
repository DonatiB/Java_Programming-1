/*7. Hacer un programa que dado un arreglo ordenado creciente de enteros
de tamaño 10 que se encuentra precargado, solicite al usuario un numero
entero y lo inserte en el arreglo manteniendo su orden. Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del arreglo)
y colocar el numero en el arreglo en la posición indicada.*/

/*7. Write a program that, given an increasing ordered array of integers of size 10 that 
is preloaded, asks the user for an integer and inserts it into the array maintaining 
its order. To do this you will have to perform a shift to the right (the last value 
of the array is lost) and place the number in the array in the indicated position.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P7_exercise7 {
  public static final int MAX = 10;
  public static void main(String[] args) {
	int [] arrint = new int [MAX];
    int num, pos;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      manual_loading_array_int(arrint);
      print_integer_array(arrint);
      System.out.println("Enter an integer: ");
      num = Integer.valueOf(entry.readLine());
      pos = get_pos_growing_sorted_array(arrint, num);
      right_shift_ord_array(arrint, pos, num);
      print_integer_array(arrint);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static void right_shift_ord_array(int [] arr, int pos, int num){
    for(int i = MAX-1; i > pos; i--){
      arr[i] = arr[i-1];
    }
    arr[pos] = num;
  }
  
  public static int get_pos_growing_sorted_array(int [] arr, int num){
    int pos = 0;
    while((pos < MAX)&&(arr[pos] < num)){
      pos++;     
    }
    return pos;
  }
 
  public static void print_integer_array(int [] arr) {
    for (int i = 0; i < MAX; i++) {
      System.out.print("[" + arr[i] + "]");
    }
    System.out.println(" ");
  }
  public static void manual_loading_array_int(int [] arr) {
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try {
      for (int i = 0; i < MAX; i++) {
        System.out.println("Enter an integer value in position " + i);
        arr[i] = Integer.valueOf(entry.readLine());
      }
    } catch (Exception exc) {
      System.out.println(exc);
    }
  }

  
}
