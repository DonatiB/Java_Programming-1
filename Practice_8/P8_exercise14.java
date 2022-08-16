/*14. Hacer un programa que dada la matriz de secuencias de caracteres definida y
precargada, elimine de cada row todas las ocurrencias de una secuencia
patrón dada por un arreglo de caracteres de tamaño igual al tamaño de
cols de la matriz (solo tiene esa secuencia con separadores al start y al
final). Al eliminar en cada row se pierden los valores haciendo los corrimientos.*/

/*14. Make a program that, given the defined and preloaded array of character sequences, 
removes from each row all occurrences of a pattern sequence given by an array of 
characters of size equal to the size of the array's columns (it only has that sequence 
with separators at the start and end). When eliminating in each row the values are lost 
making the shifts.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P8_exercise14 {
  public static final int MAXROW = 3;
  public static final int MAXCOLUMN = 20;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static final double probability_number = 0.4;
  public static void main(String[] args) {
    int [][] matint = {{0,1,2,3,0,0,3,3,3,0,1,2,3,0,0,4,0,5,0,0},
    				   {0,0,2,3,0,4,3,1,3,5,0,0,2,0,1,2,3,0,7,0},
    				   {0,0,0,7,7,1,0,6,8,0,0,1,2,3,0,0,1,5,0,0}};
    int [] arrint =    {0,0,0,1,2,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    print_matriz_int(matint);
    remove_equal_sequences_matriz(matint, arrint);
    print_matriz_int(matint);
  }
  public static void remove_equal_sequences_matriz(int [][] mat, int [] arr){
    for(int row = 0; row < MAXROW; row++){
      remove_equal_sequences_arr(mat[row], arr);
    }
  }
  public static void remove_equal_sequences_arr(int [] row, int [] arr){  
    int start = 0;
    int end = -1;
    int sizeRow = 0;
    int sizeArr = 0;
    while(start < MAXCOLUMN){
      start = get_start_sequence_arr(row, end+1);
      if(start < MAXCOLUMN){
        end = get_end_sequence_arr(row, start);
        sizeRow = end - start + 1;
        int startPattern = 0;
    	int endPattern = -1; 
        if(start < MAXCOLUMN){
            startPattern = get_start_sequence_arr(arr, endPattern+1);
            endPattern = get_end_sequence_arr(arr, startPattern);
            sizeArr = endPattern - startPattern + 1;
          if(sizeRow == sizeArr){
            if(compare_sequences(row, arr, start, startPattern, end, endPattern) == true){
              remove_sequence(row, start, end);
            }
          }
        }
      }
    } 
  }
  public static void remove_sequence(int [] arr, int start, int end){
    for(int pos = start; pos <= end; pos++){
      shift_left(arr, start);
    }
  }
  public static void shift_left(int [] arr, int start){
    for(int i = start; i < MAXCOLUMN-1; i++){
      arr[i] = arr[i+1];
    }
  }
  public static boolean compare_sequences(int [] row, int [] arr, int start, int startPattern, int end, int endPattern){
    boolean check = false;
    while((start <= end) && (startPattern <= endPattern) && (row[start] == arr[startPattern])){
        start++;
        startPattern++;
        check = true;
    }
    return check;
  }
  public static int get_start_sequence_arr(int [] arr, int pos){
    while((pos < MAXCOLUMN) && (arr[pos] == 0)){
      pos++;
    }
    return pos;
  }
  public static int get_end_sequence_arr(int [] arr, int pos){
    while((pos < MAXCOLUMN) && (arr[pos] != 0)){
      pos++;
    }
    return pos-1;
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

  public static void print_matriz_int(int [][] mat){
    for(int row = 0; row < MAXROW; row++){
      for(int col = 0; col < MAXCOLUMN; col++){
      	System.out.print(mat[row][col]+"|");
      }
      System.out.println(" ");
    }
    System.out.println(" ");
  }
}
