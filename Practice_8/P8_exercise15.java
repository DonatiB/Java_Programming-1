/*15. Hacer un programa que dada la matriz de secuencias de caracteres definida y
precargada elimine todas las secuencias que tienen orden descendente entre
sus elementos.*/

/*fifteen. Make a program that, given the defined and preloaded array of character 
sequences, eliminates all sequences that have descending order among their elements.*/

import java.util.Random;
public class P8_exercise15 {
  public static final int MAXROW = 4;
  public static final int MAXCOLUMN = 40;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static final double probabilidad_letra = 0.4;
  public static void main(String[] args) {
    char [][] matchar;
    matchar = new char [MAXROW][MAXCOLUMN];
    random_matriz_loading_sequences_char(matchar);
    print_matriz_char(matchar);
    remove_descending_order_sequences_mat(matchar);
    print_matriz_char(matchar);
  }
  public static void remove_descending_order_sequences_mat(char [][] mat){
    for(int row = 0; row < MAXROW; row++){
        remove_descending_order_sequences_arr(mat[row]);
    }
    System.out.println(" ");
  }
  public static void remove_descending_order_sequences_arr(char [] arr){
    int start = 0;
    int end = -1;
    while(start < MAXCOLUMN-1){
      start = get_start_sequence(arr, end+1);
      if(start < MAXCOLUMN-1){
        end = get_end_sequence(arr, start);
        if(((descending_order_sequence(arr, start, end)) == true )&&(end-start+1 > 1)){
          delete_sequence(arr, start, end);
          end = start;
        }
      }
    }
  }
  public static boolean descending_order_sequence(char [] arr, int start, int end){
    boolean check = false;
    int pos = start;
    while((pos <= end)&&(arr[pos] > arr[pos+1])){
      if(pos == end){
        check = true;
      }
      pos++;
    }
    return check;
  }
  public static void delete_sequence(char [] arr, int start, int end){
    for(int i = start; i <= end; i++){
      shift_left(arr, start);
    }
  }
  public static void shift_left(char [] arr, int start){
    for(int i = start; i < MAXCOLUMN-1; i++){
      arr[i] = arr[i+1];
    }
  }
  
  public static int get_start_sequence(char [] arr, int pos){
    while((pos < MAXCOLUMN) && (arr[pos] == ' ')){
      pos++;
    }
    return pos;
  }
  public static int get_end_sequence(char [] arr, int pos){
    while((pos < MAXCOLUMN) && (arr[pos] != ' ')){
      pos++;
    }
    return pos-1;
  }
  
  
  public static void random_matriz_loading_sequences_char(char [][] mat){
    for (int row = 0; row < MAXROW; row++){
    	random_arr_loading_sequences_char(mat[row]);
    }
    System.out.println("");
  }	
  public static void print_matriz_char(char [][] mat){
    for (int row = 0; row < MAXROW; row++){
      print_sequences_arr_char(mat[row]);
      System.out.println("");
    }
  }
   public static void print_sequences_arr_char(char [] arr){
    for(int pos = 0; pos < MAXCOLUMN; pos++){
      System.out.print(arr[pos]+"|");
    }
    System.out.println(" ");
  }
  
  public static void random_arr_loading_sequences_char(char [] arr){
    Random r = new Random();
    arr[0] = ' ';
    arr[MAXCOLUMN-1] = ' ';
    for (int pos = 1; pos < MAXCOLUMN-1; pos++){
      if (r.nextDouble()<probabilidad_letra){
      	arr[pos]=(char)(r.nextInt(26) + 'a');
      }
      else{
      	arr[pos]=' ';
      }
    }
  }
}
