/*4. Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario un numero entero y una posición fila, columna. Con estos
datos tendrá que realizar un corrimiento a derecha (se pierde el último valor en dicha fila)
y colocar el numero en la matriz en la posición fila, columna indicada.*/

/*4. Make a program that, given a preloaded 5*10 integer matrix, prompts the user 
for an integer and a row, column position. With these data you will have to perform a 
shift to the right (the last value in that row is lost) 
and place the number in the matrix in the indicated row position, column.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P8_exercise4 {
  public static final int MAXROW = 5;
  public static final int MAXCOLUMN = 10;
  public static final int MAX = 10;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
    int [][] matint;
    matint = new int [MAXROW][MAXCOLUMN];
    int num, row, col;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      random_matriz_loading_int(matint);
      print_matriz_int(matint);
      System.out.println("Enter an integer: ");
      num = Integer.valueOf(entry.readLine());
      System.out.println("InEnter an integer: ");
      row = Integer.valueOf(entry.readLine());
      System.out.println("InEnter an integer: ");
      col = Integer.valueOf(entry.readLine());
      if ((0<=row)&&(row < MAXROW)&&(0<=col)&&(col < MAXCOLUMN)){
        insert_num_matriz(matint[row], col, num);
        print_matriz_int(matint);
      }
      System.out.println(matint);
    }
    catch(Exception exc){
       System.out.println(exc);
    }
  }
  
  public static void insert_num_matriz(int [] arr, int col, int num){
    int pos;
    pos = right_shift(arr, col);
    if(pos == col){
        arr[pos] = num;
    }
  }
  public static int right_shift(int [] arr, int col){
    int pos = MAXCOLUMN-1;
    while(pos > col){
      arr[pos] = arr[pos-1];
      pos--;
    }
    return pos;
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
