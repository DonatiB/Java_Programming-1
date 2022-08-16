/*2. Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, obtenga la cantidad de números pares que tiene y la imprima.*/

/*2. Write a program that, given a preloaded array of integers of size 10, 
obtains the number of even numbers it has and prints it.*/

import java.util.Random;
public class P7_exercise2 {
  public static final int MAX = 10;
  public static final int MAXVALUE = 10;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
    int [] arrint = new int [MAX];
    int amount_pairs;
    load_random_array_int(arrint);
    print_integer_array(arrint);
    amount_pairs = get_even_numbers_array(arrint);
    System.out.println("total of even numbers: "+amount_pairs);
  }
  
  public static int get_even_numbers_array(int [] arr){
    int amount_pairs = 0;
    for(int i = 0; i < MAX; i++){
      //iterates until the end of the array and every time it finds even values, it increments the variable amount_pairs by one
      if((arr[i] % 2)==0){
        amount_pairs++;
      }
    }
    return amount_pairs;
  }
  
  
  
  
  public static void load_random_array_int(int [] arr){
    Random r = new Random();
    for (int pos = 0; pos < MAX; pos++){
    	arr[pos]=(r.nextInt(MAXVALUE-MINVALUE+1) + MINVALUE);
    }
  }
  
  public static void print_integer_array(int [] arr){
    for (int pos = 0; pos < MAX; pos++){
    	System.out.println("name_array["+pos+"]=>: "+arr[pos]);
    }
  }
}