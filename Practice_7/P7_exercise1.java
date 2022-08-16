/*1. Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, invierta el orden del contenido (por ejemplo: el que está en 0 se intercambia
con el que está en 9, el que está en 1 con el que está en 8...). Este intercambio no se debe
realizar de manera explícita, hay que hacer un método que incluya una iteración de
intercambio.*/

/*1. Make a program that, given an array of integers of size 
10 that is preloaded, inverts the order of the content 
(for example: the one that is in 0 is exchanged
with the one at 9, the one at 1 with the one at 8...). 
This exchange should not be done explicitly, you have 
to make a method that includes an iteration of
exchange.*/

import java.util.Random;
public class P7_exercise1 {
  public static final int MAX = 10;
  public static final int MAXVALUE = 10;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
    int [] arrint = new int [MAX];
    load_random_array_int(arrint);
    print_integer_array(arrint);//before
    reverse_array(arrint);
    print_integer_array(arrint);//after
  }
  
  public static void reverse_array(int [] arr){
    int pos = 0;
    int aux;
    int i = MAX-1;
    while(pos < MAX/2){
      //when I reach the middle all the positions will have been inverted, if it were to continue the first part would be repeated, I save position 0 of the array (arr[pos]) in an auxiliary because in the next sentence I will lose it, and the I need to exchange value with the last position of the array. Then it only remains to iterate ++ and --
      aux = arr[pos];
      arr[pos] = arr[i];
      arr[i] = aux;
      pos++;
      i--;
    }
  }
  
  /*
  public static void reverseArray(int [] array) {
        int aux;
        for (int i = 0; i < max / 2; i++) {
            aux = array[i];
            array[i] = array[max - 1 - i];
            array[max - 1 - i] = aux;
        }
    }
  */
  
  public static void load_random_array_int(int [] arr){
    Random r = new Random();
    for (int pos = 0; pos < MAX; pos++){
    	arr[pos]=(r.nextInt(MAXVALUE-MINVALUE+1) + MINVALUE);
    }
  }
  
  public static void print_integer_array(int [] array) {
    for (int i = 0; i < MAX; i++) {
      System.out.print("[" + array[i] + "]");
    }
    System.out.println(" ");
  }
}
