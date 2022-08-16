/*16. Hacer un programa que dado el arreglo definido y precargado elimine todas las
secuencias que tienen orden descendente entre sus elementos.*/

/*16. Make a program that, given the defined and preloaded array, eliminates 
all the sequences that have descending order among their elements.*/

public class P7_exercise16 {
  public static final int MAX = 30;
  public static void main(String[] args) {
    int [] arrint = {0,1,3,4,0,0,4,3,2,1,0,2,0,9,8,0,0,0,6,7,5,0,0,8,7,6,0,3,3,0};
    print_arr_sequences_int(arrint);
    remove_sequences_order_descending(arrint);
    print_arr_sequences_int(arrint);
  }
  
  public static void remove_sequences_order_descending(int [] arr){
    int start = 0;
    int end = -1;
    while(start < MAX){
      start = get_start_sequence(arr, end+1);
      if(start < MAX){
        end = get_end_sequence(arr, start);
        if(find_sequences_descending_order(arr, start, end)==true){
          remove_sequence(arr, start, end);
          end = start;
        }
      }
    }
  }
  
  public static boolean find_sequences_descending_order(int [] arr, int start, int end){
    boolean check = false;
    int pos = start;
    while((arr[pos]>arr[pos+1])&&(arr[pos]!= 0)){
        pos++;
        if(pos == end){
          check = true;
        }
    }
    return check;
  }
  
  public static void remove_sequence(int [] arr, int start, int end){
    for(int pos = start; pos <= end; pos++){
      shift_left(arr, start);
    }
  }
  
  public static void shift_left(int [] arr, int pos){
    for(int i = pos; i < MAX-1; i++){
      arr[i] = arr[i+1]; 
    }
    
  }
  public static int get_end_sequence(int [] arr, int pos){
    while((pos < MAX) &&(arr[pos] != 0)){
      pos++;
    }
    return pos-1;
  }
  
  public static int get_start_sequence(int [] arr, int pos){
    while((pos < MAX) && (arr[pos] == 0)){
      pos++;
    }
    return pos;
  }
  
  public static void print_arr_sequences_int(int [] arr){
    for(int pos = 0; pos < MAX; pos++){
      System.out.print(arr[pos]+"|");
    }
    System.out.println(" ");
  }
}
