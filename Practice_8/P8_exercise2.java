/*Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, obtenga la cantidad de números pares que tiene y la imprima.*/

/*Make a program that, given an array of integers of size 5*10 that is preloaded, 
obtains the number of even numbers it has and prints it.*/

import java.util.Random;
public class P8_ej02 {
  public static final int MAXCOLUMN = 10;
  public static final int MAXROW = 5;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
    int [][] matint;
    int evenNumber;
    matint = new int [MAXROW][MAXCOLUMN];
    random_matriz_loading_int(matint);
    print_matriz_int(matint);
    evenNumber = get_amount_even_numbers_mat(matint);
    System.out.println("amount of even number: "+evenNumber);
  }
  public static int get_amount_even_numbers_mat(int [][] mat){
    int amount = 0;
    for(int row = 0; row < MAXROW; row++){
      amount += get_amount_even_numbers_arr(mat[row]);
    }
    return amount;
  }
  public static int get_amount_even_numbers_arr(int [] arr){
    int amount = 0;
    for(int column = 0; column < MAXCOLUMN; column++){
        if((arr[column]%2)==0){
          amount++;
        }
    }
    return amount;
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
