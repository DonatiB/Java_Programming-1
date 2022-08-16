/*6. Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y elimine todas las ocurrencia de numero
en el arreglo. Mientras exista (en cada iteración tiene que buscar la posición dentro del
arreglo) tendrá que usar la posición para realizar un corrimiento a izquierda (quedarán
tantas copias de la última posición del arreglo como cantidad de ocurrencias del número).*/

/*6. Write a program that, given a preloaded array of integers of size 10, 
prompts the user for an integer and removes all occurrences of numbers in the array.
As long as it exists (in each iteration it has to search for the position within the 
array) it will have to use the position to perform a shift to the left (there will be 
as many copies of the last position of the array as the number of occurrences of the number).*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P7_exercise6 {
  public static final int MAX = 10;
  public static final int MAXVALUE = 10;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
    int [] arrint = new int [MAX];
    int num;
    BufferedReader entry = new BufferedReader( new InputStreamReader(System.in));
    try{
      load_random_array_int(arrint);
      print_integer_array(arrint);
      System.out.println("Enter an integer ");
      num = Integer.valueOf(entry.readLine());
      delete_occurrences(arrint, num);
      print_integer_array(arrint);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static void delete_occurrences(int [] arr, int num){
    int pos;
    for(int i = 0; i < MAX; i++){
         pos = get_position(arr, num);
         if(pos < MAX){
           shift_left(arr, pos);
         }
      }
  }
  
  public static int get_position(int [] arr, int num){
    int pos = 0;
    while((pos < MAX) && (arr[pos] != num)){
      pos++;
    }
    return pos;
  }
  
  public static void shift_left(int [] arr, int pos){
    for(int i = pos; i < MAX-1; i++){
      arr[i] = arr[i+1];
    } 
  }
  
  public static void load_random_array_int(int [] arr){
    Random r = new Random();
    for (int pos = 0; pos < MAX; pos++){
    	arr[pos]=(r.nextInt(MAXVALUE-MINVALUE+1) + MINVALUE);
    }
  }
  public static void print_integer_array(int [] array) {
    for (int i = 0; i < MAX; i++) {
      System.out.print("[" + array[i] + "]");
    }
    System.out.println(" ");
  }
}