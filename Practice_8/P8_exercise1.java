/*1. Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, invierta el orden del contenido por fila. Este intercambio no se debe realizar
de manera explícita, hay que hacer un método que incluya una iteración de intercambio.*/

/*1. Write a program that, given a preloaded matriz
of integers of size 5*10, reverses the order of the content by row. 
This swap should not be done explicitly, you have to make a method that includes a 
swap iteration.*/

import java.util.Random;
public class P8_exercise1 {
  public static final int MAXROW = 5;
  public static final int MAXCOLUMN = 19;
  public static final int MINVALUE = 1;
  public static final int MAXVALUE = 9;
  public static void main(String[] args) {
    int [][] matint;
    matint = new int [MAXROW][MAXCOLUMN];
    random_matriz_loading_int(matint);
    print_matriz_int(matint);
    reverse_matriz_order(matint);
    print_matriz_int(matint);
  }
  public static void reverse_matriz_order(int [][] mat){
    for(int row = 0; row < MAXROW; row++){
      reverse_array_order(mat[row]);
    }
  }
  public static void reverse_array_order(int [] arr){
    int aux;
    for(int column = 0; column < MAXCOLUMN / 2; column++){
      aux = arr[column];
      arr[column] = arr[MAXCOLUMN - 1 - column];
      arr[MAXCOLUMN - 1 - column] = aux;
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
  /*public static void random_matriz_loading_int(int [][] mat){
    for(int row = 0; row < MAXROW; row++){
      print_integer_array(mat[row]);
    }
  }
  public static void print_integer_array(int [] arr){
    Random r = new Random();
    for(int pos = 0; pos < MAXCOLUMN; pos++){
      arr[pos]=(r.nextInt(MAXVALOR-MINVALUE+1)+MINVALUE);
    }
  }*/
  public static void print_matriz_int(int [][] mat){
    for(int row = 0; row < MAXROW; row++){
      for(int column = 0; column < MAXCOLUMN; column++){
      	System.out.print(mat[row][column]+"|");
      }
      System.out.println(" ");
    }
    System.out.println(" ");
  }
  /*public static void print_matriz_int(int [][] mat){
    for(int row = 0; row < MAXROW; row++){
      print_integer_array(mat[row]);
    }
    System.out.println(" ");
  }
  public static void print_integer_arrayt(int [] arr){
    for(int pos = 0; pos < MAXCOLUMN; pos++){
      System.out.print(arr[pos]+"|");
    }
    System.out.println(" ");
  }*/
}
