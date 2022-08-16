/*10. Se tiene un arreglo de enteros de tamaño 20 de secuencias de números
entre 1 y 9, separadas por 0. El arreglo esta precargado, y además
empieza y termina con uno o más separadores 0. Hacer un programa que
permita obtener a través de métodos la posición de inicio y la posición de
fin de la secuencia ubicada a partir de una posición entera ingresada por
el usuario. Finalmente, si existen imprima por pantalla ambas posiciones
obtenidas.*/

/*10. There is an array of integers of size 20 of sequences of numbers between 1 and 9, 
separated by 0. The array is preloaded, and also begins and ends with one or more 0 
separators. Make a program that allows obtaining through methods the start position 
and end position of the sequence located from an integer position entered by the user. 
Finally, if they exist, print both positions obtained on the screen.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public  class P7_exercise10 {
  public static final int MAX = 20;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static final double probability_number = 0.4;
  public static void main(String[] args) {
    int [] arrint = new int [MAX];
    int pos, startPos, endPos;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
      random_sequence_arr_loading_int(arrint);
      print_arr_sequences_int(arrint);
      System.out.println("Enter an integer: ");
      pos = Integer.valueOf(entry.readLine());
      startPos = get_start_pos(arrint, pos);
      endPos = get_end_pos(arrint, startPos);
      if((pos != 0) && (pos < MAX-1 ) && (arrint[startPos] != 0)){
        System.out.println("The start position is " + startPos + " and the end position is " + endPos + " of the sequence located at position " + pos + "\n");
      	print_arr_sequences_int(arrint);
      }else{
        System.out.println("No sequence found at the entered position");
      }
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static int get_start_pos(int [] arr, int pos){
    int startPos;
    while((pos > 0) && (arr[pos] != 0)){
		pos--;
    } 
    startPos = pos + 1;
    return startPos;
  }
  
  public static int get_end_pos(int [] arr, int pos){
    int endPos;
    while((pos < MAX - 1) && (arr[pos] != 0)){
      pos++;
    }
    endPos = pos - 1;
    return endPos;
  }
  
  public static void print_arr_sequences_int(int [] arr){
    System.out.println("Array of integer sequences\n");
    for(int pos = 0; pos < MAX; pos++){
      System.out.print(arr[pos] + "|" );
    }
    System.out.println(" ");
  }
  
  public static void random_sequence_arr_loading_int(int [] arr){ 
    Random r = new Random();
    arr[0] = 0;
    arr[MAX-1] = 0;
    for (int pos = 1; pos < MAX-1; pos++){
      if (r.nextDouble()>probability_number){
      	arr[pos]=(r.nextInt(MAXVALUE-MINVALUE+1) + MINVALUE);
      }
      else{
      	arr[pos]=0;
      }
	}
  }
}