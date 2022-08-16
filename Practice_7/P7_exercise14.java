/*14. Hacer un programa que dado el arreglo definido y precargado, y un número entero
ingresado por el usuario, copie de forma continua las secuencias de tamaño igual al
número ingresado en otro arreglo de iguales características e inicializado con 0. La
copia en este último arreglo deben comenzar desde el principio del mismo.*/

/*14. Make a program that given the defined and preloaded array, and an integer entered 
by the user, continuously copy sequences of size equal to the number entered in another
 array with the same characteristics and initialized with 0. The copy in this last array
  must start from the beginning of it.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P7_exercise14 {
  public static final int MAX = 40;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE  = 1;
  public static final double probability_number = 0.4;
  public static void main(String[] args) {
    int [] arrint = new int [MAX];
    int [] arrcopy = new int [MAX];
    int num;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      random_sequence_arr_loading_int(arrint);
      print_arr_sequences_int(arrint);
      System.out.println("Enter an integer: ");
      num = Integer.valueOf(entry.readLine());
      copy_equal_sized_sequences(arrint, arrcopy, num);
      print_arr_sequences_int(arrcopy);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static void copy_equal_sized_sequences(int [] arr, int [] arrcopy, int num){
    int start = 0;
    int end = -1;
    int pos = 0;
    int size = 0;
    while(start < MAX){
      start = get_start_sequence(arr, end+1);
      if(start < MAX){
        end = get_end_sequence(arr, start);
        size = get_size_sequence(arr, start, end);
        if(size == num){
          pos = pos + 1;
          while(start <= end){
            arrcopy[pos] = arr[start];
            pos++;
            start++;
          }
          arr[pos] = 0;
        }
      }
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
  
  public static void print_arr_sequences_int(int [] arr){
    System.out.println("Array of integer sequence\n");
    for(int pos = 0; pos < MAX; pos++){
      System.out.print(arr[pos]+"|");
    }
    System.out.println(" ");
  }
}
