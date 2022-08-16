/*8. Hacer un programa que dado un arreglo ordenado creciente de enteros
de tamaño 10 que se encuentra precargado, solicite al usuario un numero
entero y elimine la primer ocurrencia de numero (un número igual) en el
arreglo (si existe).*/

/*8. Write a program that, given a preloaded growing sorted array of integers 
of size 10, prompts the user for an integer and removes the first occurrence 
of number (an equal number) in the array (if it exists).*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
class P7_exercise8 {
  public static final int MAX = 10;
  public static void main(String[] args) {
    int [] arrint = new int [MAX];
    int num, pos;;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      manual_loading_array_int(arrint);
      print_integer_array(arrint);
      System.out.println("Enter an integer: ");
      num = Integer.valueOf(entry.readLine());
      pos = get_pos_growing_ord_array(arrint, num);
      if((pos < MAX) && (arrint[pos] == num)){
        left_shift_growing_ord_array(arrint, pos);
        print_integer_array(arrint);
      }else{
        System.out.println(num+" does not exist in the array");
      }
      
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  public static int get_pos_growing_ord_array(int [] arr, int num){
    int pos = 0;
    while((pos < MAX)&&(arr[pos] < num)){
      pos++;
    }
    return pos;
  }
  public static void left_shift_growing_ord_array(int [] arr, int pos){
    for(int i = pos; i < MAX-1; i++){
      arr[i] = arr[i+1];
    }
  }
  
  public static void manual_loading_array_int(int [] arr){
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    try{
      for(int i = 0; i < MAX; i++){
        System.out.println("Enter an integer: ");
        arr[i]= Integer.valueOf(entrada.readLine());
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static void print_integer_array(int [] arr){
    for(int i = 0; i < MAX; i++){
      System.out.println("["+ arr[i] + "]");
    }
    System.out.println(" ");
  }
}
