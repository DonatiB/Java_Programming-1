/*13. Hacer un programa que dado el arreglo deendido y precargado, y un número entero
ingresado por el usuario, elimine las secuencias de tamaño igual al número ingresado.*/

/*13. Make a program that given the deended and preloaded array, and an integer
entered by the user, remove sequences of size equal to the number entered.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P7_exercise13_2 {
  public static final int MAX = 40;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static final double probability_number = 0.4;
  public static void main(String[] args) {
    int [] arrint = new int [MAX];
    int num;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      random_sequence_arr_loading_int(arrint);
      print_arr_sequences_int(arrint);
      System.out.println("Ingrese un numero entero: ");
      num = Integer.valueOf(entry.readLine());
      remove_sequences_num_size(arrint, num);
      print_arr_sequences_int(arrint);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static void remove_sequences_num_size(int [] arr, int num){
    int start = 0;
    int end = -1;
    int pos = 0;
    int size = 0;
    while(pos < MAX){
      start = get_start_sequence(arr, end+1);
      if(pos < MAX){
        end = get_end_sequence(arr, start);
        size = get_size_sequence(arr, start, end);
        if(size == num){
          remove_sequence(arr, start, end);
        }
      }
      pos++;
    }
   }
  
  public static void remove_sequence(int [] arr, int start, int end){
    for(int pos = start; pos <= end; pos++){
      shift_left(arr, start);
    }
  }
  
  public static void shift_left(int[] arr, int start) {
    for(int i = start; i < MAX - 1; i++) {
      arr[i] = arr[i + 1];
    }  
  }
  
  public static int get_size_sequence(int [] arr, int start, int end){
    int size = 0;
    for(int pos = start; pos <= end; pos++){
      size++;
    }
    return size;
  }
  
  public static int get_start_sequence(int [] arr, int pos){
    while((pos < MAX) && (arr[pos] == 0)){
      pos++;
    }
    return pos;
  }

  public static int get_end_sequence(int [] arr, int pos){
    while((pos < MAX) && (arr[pos] != 0)){
      pos++;
    }
    return pos-1;
  }

  public static void print_arr_sequences_int(int [] arr){
    System.out.println("Array of integer sequences\n");
    for(int pos = 0; pos < MAX; pos++){
      System.out.print(arr[pos]+"|");
    }
    System.out.println(" ");
  }
  
  public static void random_sequence_arr_loading_int(int [] arr){
    Random r = new Random();
    arr[0] = 0;
    arr[MAX-1] = 0;
    for(int pos = 1; pos < MAX-1; pos++){
      if(r.nextDouble()<probability_number){
        arr[pos]=(r.nextInt(MAXVALUE-MINVALUE+1) + MINVALUE);
      }
    }
  }
}
