/*Se tiene una matriz de enteros de tamaño 4*20 de secuencias de números
entre 1 y 9 (por cada row), separadas por 0. La matriz esta precargada, y
además cada row empieza y termina con uno o más separadores 0.

10. Hacer un programa que dada la matriz de secuencias de enteros definida
y precargada, permita obtener a través de métodos la posición de start y
la posición de fin de la secuencia ubicada a partir de una posición entera
y una row, ambas ingresadas por el usuario. Finalmente, si existen imprima
por pantalla ambas posiciones obtenidas.*/

/* There is an array of integers of size 4*20 of sequences of numbers between 1 and 9 
(for each row), separated by 0. The array is preloaded, and each row also begins 
and ends with one or more 0 separators.

10. Write a program that, given the defined and preloaded array of integer sequences, 
allows you to obtain, through methods, the start position and the end position of the 
sequence located from an integer position and a row, both entered by the user. Finally,
 if they exist, print both positions obtained on the screen.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P8_exercise10 {
  public static final int MAXROW = 4;
  public static final int MAXCOLUMN = 20; 
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static final double probability_number = 0.4;
  public static void main(String[] args) {
	int [][] matint;
    matint = new int [MAXROW][MAXCOLUMN];
    int pos, row; 
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      random_matriz_loading_sequences_int(matint);
      print_matriz_int(matint);
      System.out.println("Ingrese un numero entero de posicion(entre 0 y 19): ");
      pos = Integer.valueOf(entry.readLine());
      System.out.println("Ingrese un numero entero de row(entre 0 y 3): ");
      row = Integer.valueOf(entry.readLine());
      if((row >= 0)&&(row < MAXCOLUMN)){
        print_get_positions(matint[row], pos);
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static void print_get_positions(int [] arr, int pos){
    int end;
    int start;
    if((pos < MAXCOLUMN) && (arr[pos] != 0)){
      start = get_start_sequences(arr, pos);
      end = get_end_sequences(arr, start);
      System.out.println("The start postion is "+start+" and end postion is "+end);
    }else{
      System.out.println("No sequences found at position");
    } 
  }
  
  public static int get_start_sequences(int [] arr, int pos){
    int i = pos;
    while((i > 0) && (arr[i] != 0)){
      i--;
    }
    return i+1;
  }
  
  public static int get_end_sequences(int [] arr, int pos){
    int i = pos;
    while((i < MAXCOLUMN) && (arr[i] != 0)){
      i++;
    }
    return i-1;
  }
 
  public static void random_matriz_loading_sequences_int(int [][] mat){
    for (int row = 0; row < MAXROW; row++){
    	random_array_loading_sequences_int(mat[row]);
    }
    System.out.println("");
  }
  
  public static void random_array_loading_sequences_int(int [] arr){ 
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
