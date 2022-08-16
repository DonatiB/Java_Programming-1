/*11. Hacer un programa que dado el arreglo definido y precargado permita encontrar la
posición de inicio de la secuencia cuya suma de valores sea mayor.*/

/*11. Make a program that, given the defined and preloaded array, allows you to find the
start position of the sequence whose sum of values is greater.*/

import java.util.Random;
public class P7_exercise11 {
  public static final int MAX = 40;
  public static final double probability_number = 0.4;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
    int [] arrint = new int [MAX];
    int startPos;
    random_sequence_arr_loading_int(arrint);
    print_arr_sequences_in(arrint);
    startPos = get_pos_largest_sequence (arrint);
    System.out.println("The starting position of the sequence whose value sum is greater is: "+ startPos);
  }
  
  public static int get_pos_largest_sequence(int [] arr){
    int sum = 0;
    int startPosLargestSequence = 0;
    int larger = 0;
    int startPos = 0;
    int endPos = -1;
    while(startPos < MAX){
        startPos = get_start_sequences(arr, endPos+1);
      	if(startPos < MAX){
          endPos = get_end_sequences(arr, startPos);
          sum = sum_x_sequences(arr, startPos, endPos);
          if(sum > larger){
            larger = sum;
            startPosLargestSequence = startPos;
          }
        }
    }
    return startPosLargestSequence;
  }
  
  public static int sum_x_sequences(int [] arr, int startPos, int endPos){
    int sum = 0;
    while(startPos <= endPos){
      sum += arr[startPos];
      startPos++;
    }
    return sum;
  }
  
  public static int get_start_sequences(int [] arr, int pos){
    while((pos < MAX) && (arr[pos] == 0)){
      pos++;
    }
    return pos;
  }
  
  public static int get_end_sequences(int [] arr, int pos){
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
  
  public static void print_arr_sequences_in(int [] arr){
    System.out.println("Array of integer sequences\n");
    for(int pos = 0; pos < MAX; pos++){
      System.out.print(arr[pos] + "|");
    }
    System.out.println(" ");
  }
}