/*13. Hacer un programa que dada la matriz de secuencias de enteros definida y
precargada, y un número entero ingresado por el usuario, elimine de cada row
las secuencias de tamaño igual al número ingresado.*/

/*13. Write a program that, given the defined and preloaded array of integer sequences, 
and an integer entered by the user, removes from each row the sequences of size equal 
to the entered number.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P8_exercise13 {
  public static final int MAXROW = 4;
  public static final int MAXCOLUMN = 20;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static final double probability_number = 0.4;
  public static void main(String[] args) {
    int [][] matint;
    matint = new int [MAXROW][MAXCOLUMN];
    int num;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      random_matriz_loading_sequences_int(matint);
      print_matriz_int(matint);
      System.out.println("Enter an integer: ");
      num = Integer.valueOf(entry.readLine());
      remove_sequence_num_size_matriz(matint, num);
      print_matriz_int(matint);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  public static void remove_sequence_num_size_matriz(int [][] mat, int num){
    for(int row = 0; row < MAXROW; row++){
      remove_sequence_num_size_arr(mat[row], num);
    }
  }
  public static void remove_sequence_num_size_arr(int [] arr, int num){
    int start = 0;
    int end = -1;
    int size = 0;
    while(start < MAXCOLUMN){
      start = get_start_sequence(arr, end+1);
      if(start < MAXCOLUMN){
        end = get_end_sequence(arr, start);
        size = get_size_sequence(arr, start, end);
        if(size == num){
          remove_sequence(arr, start, end);
        }
      }
    }
  }
  public static void remove_sequence(int [] arr, int start, int end){
    for(int i = start; i <= end; i++){
      shift_left(arr, start);
    }
  }
  public static void shift_left(int [] arr, int start){
    for(int i = start; i < MAXCOLUMN-1; i++){
      arr[i] = arr[i+1];
    }
  }
  public static int get_size_sequence(int [] arr, int start, int end){
    int size = 0;
    for(int i = start; i <= end; i++){
      size++;
    }
    return size;
  }
  public static int get_end_sequence(int [] arr, int pos){
    while((pos < MAXCOLUMN) && (arr[pos] != 0)){
      pos++;
    }
    return pos-1;
  }
  public static int get_start_sequence(int [] arr, int pos){
    while((pos < MAXCOLUMN) && (arr[pos] == 0)){
      pos++;
    }
    return pos;
  }
  
  
  public static void random_matriz_loading_int(int [][] mat){
    for(int row = 0; row < MAXROW; row++){
      Random r = new Random();
      for(int col = 0; col < MAXCOLUMN; col++){
        mat[row][col]=(r.nextInt(MAXVALUE-MINVALUE+1)+MINVALUE);
      }
    }
  }
  public static void print_matriz_int(int [][] mat){
    for(int row = 0; row < MAXROW; row++){
      for(int col = 0; col < MAXCOLUMN; col++){
      	System.out.print(mat[row][col]+"|");
      }
      System.out.println(" ");
    }
    System.out.println(" ");
  }
  
  public static void random_matriz_loading_sequences_int(int [][] mat){
    for (int row = 0; row < MAXROW; row++){
    	random_arr_loading_sequences_int(mat[row]);
    }
    System.out.println("");
  }
  
  public static void random_arr_loading_sequences_int(int [] arr){ 
    Random r = new Random();
    arr[0] = 0;
    arr[MAXCOLUMN-1] = 0;
    for (int pos = 1; pos < MAXCOLUMN-1; pos++){
      if (r.nextDouble()>probability_number){
      	arr[pos]=(r.nextInt(MAXVALUE-MINVALUE+1) + MINVALUE);
      }
      else{
      	arr[pos]=0;
      }
	}
  }
}
