/*6. Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario un numero entero y elimine todas las ocurrencia de numero
en la matriz si existe. Mientras exista (en cada iteración tiene que buscar la posición row y
col) tendrá que usar dicha posición para realizar un corrimiento a izquierda.*/

/*6. Write a program that, given a preloaded 5*10 integer array, prompts the user for 
an integer and removes all occurrences of number in the array if it exists. As long 
as it exists (in each iteration it has to search for the row and column position) it 
will have to use that position to perform a left shift.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P8_exercise6 {
  public static final int MAXROW = 5;
  public static final int MAXCOLUMN = 10;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
    int [][] matint;
    matint = new int [MAXROW][MAXCOLUMN];
    int num; 
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      random_matriz_loading_int(matint);
      print_matriz_int(matint);
      System.out.println("Enter an integer: ");
      num = Integer.valueOf(entry.readLine());
      delete_all_ocurrence(matint, num);
      print_matriz_int(matint);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static void delete_all_ocurrence(int [][] mat, int num){
    for(int row = 0; row < MAXROW; row++){
      delete_all_ocurrence_arreglo(mat[row], num);
    }
  }
  
  public static void delete_all_ocurrence_arreglo(int [] arr, int num){
    int pos = 0;
    for(int i = 0; i < MAXCOLUMN; i++){
      pos = get_pos(arr, num);
      if(pos < MAXCOLUMN){
        shift_left(arr, pos);
      }
    }
  }  
  public static int get_pos(int [] arr, int num){
    int pos = 0;
    while((pos < MAXCOLUMN) && (arr[pos] != num)){
      pos++;
    }
    return pos;
  }
  
  public static void shift_left(int [] arr, int pos){
    for(int i = pos; i < MAXCOLUMN-1; i++){
      arr[i] = arr[i+1];
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
