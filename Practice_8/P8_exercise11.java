/*11. Hacer un programa que dada la matriz de secuencias de enteros definida y
precargada permita encontrar por cada row la posición de start y fin de la
secuencia cuya sum de valores sea greater.*/

/*11. Write a program that, given the defined and preloaded array of integer sequences,
 allows you to find for each row the start and end position of the sequence whose sum 
 of values is greater.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class P8_ej11 {
  public static final int MAXROW = 4;
  public static final int MAXCOLUMN = 20;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static final double probability_number = 0.4;
  public static void main(String[] args) {
    int [][] matint;
    matint = new int [MAXROW][MAXCOLUMN];
    random_matriz_loading_sequences_int(matint);
    print_matriz_int(matint);
    print_start_end_highest_sum_sequence_by_row(matint);
  }
  public static void print_start_end_highest_sum_sequence_by_row(int [][] mat){
    for(int row = 0; row < MAXROW; row++){
      print_start_end_highest_sum_sequence(mat[row]);
    }
  }
  public static void print_start_end_highest_sum_sequence(int [] arr){
    int start = 0;
    int end = -1;
    int startGreater = 0;
    int endGreater = 0;
    int greater = 0;
    int sum = 0;
    while(start < MAXCOLUMN){
      start = get_start_sequences(arr, end+1);
      if(start < MAXCOLUMN){
        end = get_end_sequence(arr, start);
        sum = get_sum_sequence(arr, start, end);
        if(sum > greater){
          greater = sum;
          startGreater = start;
          endGreater = end;
        }
      }
    }
    System.out.println("The greater sum sequences "+greater+" start in the pos "+startGreater+" and end in pos "+endGreater);
  }
  public static int get_sum_sequence(int [] arr, int start, int end){
    int sum = 0;
    for(int i = start; i <= end; i++){
      sum += arr[i];
    }
    return sum;
  }
  public static int get_start_sequences(int [] arr, int pos){
    while((pos < MAXCOLUMN) && (arr[pos] == 0)){
      pos++;
    }
    return pos;
  }
  public static int get_end_sequence(int [] arr, int pos){
    while((pos < MAXCOLUMN) && (arr[pos] != 0)){
      pos++;
    }
    return pos-1;
  }
  
  public static void random_matriz_loading_sequences_int(int [][] mat){
    for (int row = 0; row < MAXROW; row++){
    	cargar_arreglo_secuencias_aleatorio_int(mat[row]);
    }
    System.out.println("");
  }
  
  public static void cargar_arreglo_secuencias_aleatorio_int(int [] arr){ 
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
