/*3. Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario una posición y realice un corrimiento a izquierda o hacia la
menor posición del arreglo.*/

/*3. Write a program that, given a preloaded array of integers of size 10, 
asks the user for a position and performs a shift to the left or to the 
smallest position in the array.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P7_exercis03 {
  public static final int MAX = 10;
  public static final int MAXVALUE = 10;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
    int [] arrint = new int [MAX];
    int pos;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      load_random_array_int(arrint);
      print_integer_array(arrint);
      System.out.println("enter a position(integer between 1 and 10): ");
      pos = Integer.valueOf(entry.readLine());
      shift_left(arrint, pos);
      print_integer_array(arrint);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static void shift_left(int [] arr, int pos){
    //I do the left shift from the position entered by the user
    for(int i = 0; i < pos; i++){
      arr[i] = arr[i+1];
    }
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