/*8. Hacer un programa que dado una matriz ordenada creciente por rows de
enteros de tamaño 4*5 que se encuentra precargada, solicite al usuario un
numero entero y una row, y elimine la primer ocurrencia de numero en la
row indicada (un número igual) si existe.*/

/*8. Write a program that, given a preloaded growing ordered matrix by rows of 
integers of size 4*5, asks the user for an integer and a row, and eliminates
 the first occurrence of number in the indicated row (an equal number) if exists.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class P8_exercise8 {
  public static final int MAXROW = 4;
  public static final int MAXCOLUMN = 5;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
  	int [][] matint;
    int num, row, pos;
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
      pos = delete_first_ocurrence_matriz(matint[row], num);
      if((0<=row)&&(row < MAXROW)&&(pos < MAXCOLUMN)){
        print_matriz_int(matint);
      }
      
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static int delete_first_ocurrence_matriz(int [] arr, int num){
    int pos;
    pos = get_first_ocurrence_matriz_ord_growing(arr, num);
    if(pos == MAXCOLUMN){
      System.out.println(num+" not found");
    }else if((arr[pos] == num) && (pos == 0)){
      shift_left(arr, pos);
    }else if((arr[pos] == num)){
      shift_left(arr, pos);
    }else if((arr[pos] == num) && (pos == MAXCOLUMN-1)) {
      shift_right(arr, pos);
    }
    return pos;
  }
  public static int get_first_ocurrence_matriz_ord_growing(int [] arr, int num){
    int pos = 0;
    while((pos < MAXCOLUMN) && (arr[pos] != num)){
      pos++;
    }
    return pos;
  }
  public static void shift_right(int [] arr, int pos){
    for(int i = MAXCOLUMN-1; i > 0; i--){
      arr[i] = arr[i-1];
    }
  }
  public static void shift_left(int [] arr, int pos){
    for(int i = pos; i < MAXCOLUMN-1; i++){
      arr[i] = arr[i+1];
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

