/*9. Hacer un programa que dado una matriz de enteros de tamaño 4*5 que
se encuentra precargada, solicite al usuario el ingreso de una row y dos
números enteros (cols de la matriz), y ordene de forma creciente la
matriz en la row indicada entre las dos posiciones cols ingresadas.*/

/*9. Write a program that, given a preloaded 4*5 size integer matrix, 
asks the user to enter a row and two integers (columns of the matrix), 
and order the matrix in increasing order in the row indicated between 
the two column positions entered.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class P8_exercise9 {
  public static final int MAXROW = 4;
  public static final int MAXCOLUMN = 10;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
    int [][] matint;
    matint = new int [MAXROW][MAXCOLUMN];
    int row, startColumn, endColumn;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      random_matriz_loading_int(matint);
      print_matriz_int(matint);
      System.out.println("Enter a row number: ");
      row = Integer.valueOf(entry.readLine());
      System.out.println("Enter a start column number: ");
      startColumn = Integer.valueOf(entry.readLine());
      System.out.println("Enter a end column number: ");
      endColumn = Integer.valueOf(entry.readLine());
      if((row>=0)&&(row<MAXROW)&&(startColumn>=0)&&(startColumn<MAXCOLUMN)&&(endColumn>=0)&&(endColumn<MAXCOLUMN)){
        sort_growing_arr_between_selected_cols(matint[row], startColumn, endColumn);
        print_matriz_int(matint);
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static void sort_growing_arr_between_selected_cols(int [] arr, int start, int end){
    int minorPos, temp;
    for(int i = start; i <= end; i++){
      minorPos = i;
      for(int j = i + 1; j <= end; j++){
        if(arr[j] < arr[minorPos]){
          minorPos = j;
        }
      }
      if(minorPos != i){
        temp = arr[i];
        arr[i] = arr[minorPos];
        arr[minorPos] = temp;
      }
    }
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
}
