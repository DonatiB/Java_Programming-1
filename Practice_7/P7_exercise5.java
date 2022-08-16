/*5. Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y elimine la primer ocurrencia del numero
(un número igual) en el arreglo (si existe). Para ello tendrá que buscar la posición y si está,
realizar un corrimiento a izquierda (queda una copia de la última posición del arreglo en la
anteúltima posición).*/

/*5. Write a program that, given a preloaded array of 
integers of size 10, prompts the user for an integer and 
removes the first occurrence of the number (an equal number) 
in the array (if it exists). To do this, you will have to search
for the position and if it is, carry out a shift to the left (a copy 
of the last position of the array remains in the penultimate position).*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P7_exercise5 {
  public static final int MAX = 10;
  public static final int MAXVALUE = 10;
  public static final int MINVALUE = 1;
  public static void main(String[] args) {
    int [] arrint = new int [MAX];
    int num, pos;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      load_random_array_int(arrint);
      print_integer_array(arrint);
      System.out.println("Enter an integer: ");
      num = Integer.valueOf(entry.readLine());
      pos = get_position(arrint, num);
      //ask if it exists, if pos is MAX(10) the position does not exist
      if(pos < MAX){
        System.out.println(num + " is in position " + pos);
        left_shift(arrint, pos);
        print_integer_array(arrint);
      }else{
        System.out.print("position not found");
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static int get_position(int [] arr, int num){
    int pos = 0;
    //as long as pos is less than MAX (because if it is greater than max the position does not exist and it will return 10, the max position) and different from number (because if it is equal to number it will return the position of the number),
    while((pos < MAX) && (arr[pos] != num)){
      pos++;
    }
    //I loop through the array from the last position, and when the position (i) is equal to the user's number, I return the position
    return pos;
  }
  
  public static void left_shift(int [] arr, int pos){
    //from the position pos I do the left shift
    for(int i = pos; i < MAX-1; i++){
      arr[i] = arr[i+1];
    } 
  }
  
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