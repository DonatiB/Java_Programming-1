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
public class P8_exercise5_1 {
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
      delete_first_occurrence(matint, num);
      print_matriz_int(matint);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  public static void delete_first_occurrence(int [][] mat, int num){
    int row = 0;
    while(row < MAXROW){
      if(delete_occurrence_arr(mat[row], num) == true){
        row = MAXROW;
      }
      else{
        row++;
      }
    }
  }
  public static boolean delete_occurrence_arr(int [] arr, int num){
    boolean check = false;
    int pos = 0;
    while(pos < MAXCOLUMN){
      if(arr[pos] == num){
        shift_left(arr, pos);
        check = true;
        pos = MAXCOLUMN;
      }
      else{
        pos++;
      }
    }
    return check;
  }
  public static void shift_left(int [] arr, int pos){
    for(int i = pos; i < MAXCOLUMN-1; i++){
      arr[i] = arr[i+1];
    }
  }
  
  
  
  
  public static void random_matriz_loading_int(int [][] mat){
    for(int row = 0; row < MAXROW; row++){
      Random r = new Random();
      for(int column = 0; column < MAXCOLUMN; column++){
        mat[row][column]=(r.nextInt(MAXVALUE-MINVALUE+1)+MINVALUE);
      }
    }
  }
  public static void print_matriz_int(int [][] mat){
    for(int row = 0; row < MAXROW; row++){
      for(int column = 0; column < MAXCOLUMN; column++){
      	System.out.print(mat[row][column]+"|");
      }
      System.out.println(" ");
    }
    System.out.println(" ");
  }
}
