/*3. Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario una posición fila, columna y realice un corrimiento a
izquierda.*/ 

/*3. Escriba un programa que, dada una matriz de enteros precargada de 5*10, 
solicite al usuario una fila, una posición de columna y realice un desplazamiento 
a la izquierda.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P8_exercise3{
  public static final int MAXROW = 5;
  public static final int MAXCOLUMN = 10;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
    int [][] matint;
    matint = new int [MAXROW][MAXCOLUMN];
    int row, column;
    random_matriz_loading_int(matint);
    print_matriz_int(matint);
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter an integer: ");
      row = Integer.valueOf(entry.readLine());
      System.out.println("Enter an other integer: ");
      column = Integer.valueOf(entry.readLine());
      if((row >= 0) && (row < MAXROW) && (column >= 0) && (column < MAXCOLUMN)){
        shift_left_arr(matint[row], column);
        print_matriz_int(matint);
      }else{
        System.out.println("Position not found");
      }

    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  public static void shift_left_arr(int [] arr, int pos){
    for(int i = 0; i < pos; i++){
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
