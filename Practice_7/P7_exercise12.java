/*12. Hacer un programa que dado el arreglo definido y precargado permita encontrar la
posición de inicio de la anteúltima secuencia (considerar comenzar a buscarla a
partir de la ultima posición del arreglo).*/

/*12. Make a program that, given the defined and preloaded array, allows finding the 
starting position of the penultimate sequence (consider starting to search for it from 
the last position of the array).*/

import java.util.Random;
class P7_exercise12 {
  public static final int MAX = 40;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static final double probability_number = 0.4;
  public static void main(String[] args) {
    int [] arrint = new int [MAX];
    int startPos;
    random_sequence_arr_loading_int(arrint);
    print_arr_sequences_in(arrint);
    startPos = get_start_pos_penultimate_sequences(arrint);
    System.out.println("The start position of the penultimate sequence is: "+ startPos);
  }
  
  public static int get_start_pos_penultimate_sequences(int [] arr){
    int start = MAX;
    int end  = MAX-1;
    for(int pos = 0; pos < 2; pos++){
      end = get_end_sequence(arr, start-1);
      if(pos < 2){
        start = get_start_sequence(arr, end);
      }
    }
    return start;
  }
  
  public static int get_end_sequence(int [] arr, int end){
    while((end > 0) && (arr[end] == 0)){
      end--;
    }
    return end;
  }
  
  public static int get_start_sequence(int [] arr, int end){
    while((end > 0) && (arr[end] != 0)){
      end--;
    }
    return end+1;
  }
  
  public static void random_sequence_arr_loading_int(int [] arr){
    Random r = new Random();
    arr[0] = 0;
    arr[MAX-1] = 0;
    for(int pos = 1; pos < MAX-1; pos++){
      if(r.nextDouble()<probability_number){
        arr[pos]=(r.nextInt(MAXVALUE-MINVALUE+1)+ MINVALUE);
      } 
    }
  }
  
  public static void print_arr_sequences_in(int [] arr){
    System.out.println("Array of integer sequences\n");
    for(int pos = 0; pos < MAX; pos++){
      System.out.print(arr[pos]+"|");
    }
    System.out.println(" ");
  }
}
