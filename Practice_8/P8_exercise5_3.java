/*5. Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario un numero entero y elimine la primer ocurrencia de numero
en la matriz (un número igual) si existe. Para ello tendrá que buscar la posición y si está,
realizar un corrimiento a izquierda y no continuar buscando.*/

/*5. Write a program that, given a preloaded 5*10 array of integers, 
prompts the user for an integer and removes the first occurrence of number 
in the array (an equal number) if it exists. To do this you will have to search 
for the position and if it is, perform a shift to the left and not continue searching.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P8_exercise5_3 {
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
      remove_all_occurrence(matint, num);
      print_matriz_int(matint);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  public static void remove_all_occurrence(int [][] mat, int num){
    int row = 0;
    int col;
    while(row < MAXROW){
      col = get_pos_array(mat[row], num);
      if(col == MAXCOLUMN){
        row++;
      }else{
        shift_left(mat[row], col);
        row = MAXROW;
      } 
    }
  }
                 
  public static int get_pos_array(int [] arr, int num){
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
