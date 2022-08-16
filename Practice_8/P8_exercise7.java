/*7. Hacer un programa que dado una matriz ordenada creciente por rows de
enteros de tamaño 4*5 que se encuentra precargada, solicite al usuario un
numero entero y una row, y luego inserte el numero en la matriz en la row
indicada manteniendo su orden.*/

/*7. Write a program that, given a preloaded growing row-ordered matrix of 
integers of size 4*5, asks the user for an integer and a row, and then inserts 
the number into the matrix in the indicated row, maintaining its order.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class P8_exercise7 {
  public static final int MAXROW = 4;
  public static final int MAXCOLUMN = 5;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
  	int [][] matint;
    int num, row;
    matint = new int [MAXROW][MAXCOLUMN];
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      random_matriz_loading_int(matint);
      sort_growing_matriz_by_row(matint);
      print_matriz_int(matint);
      System.out.println("Enter an integer: ");
      num = Integer.valueOf(entry.readLine());
      System.out.println("Enter a row number: ");
      row = Integer.valueOf(entry.readLine());
      if ((0<=row)&&(row < MAXROW)){
        insert_num_growing_ord_matriz (matint[row], num);
        print_matriz_int(matint);
      }else{
         System.out.println("row not found");
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static void insert_num_growing_ord_matriz (int [] arr, int num){
    int pos = 0;
    while(arr[pos] < num){
      pos++;
    }
    if(pos < MAXCOLUMN){
      shift_right(arr, pos);
      arr[pos] = num;
    }
  } 
  
  public static void shift_right(int [] arr, int pos){
    for(int i = MAXCOLUMN-1; i > pos; i--){
      arr[i] = arr[i-1];
    }
  }
  
  
  public static void sort_growing_matriz_by_row(int [][] mat){
    for(int row = 0; row < MAXROW; row++){
      sort_growing_arr(mat[row]);
    }
  }
  
  public static void sort_growing_arr(int [] arr){
    int minorPos, temp;
    for(int i = 0; i < MAXCOLUMN; i++){
      minorPos = i;
      for(int j = i + 1; j < MAXCOLUMN; j++){
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
