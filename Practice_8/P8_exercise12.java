/*12. Hacer un programa que dada la matriz de secuencias de caracteres definida y
precargada, permita encontrar por cada row la posición de start y fin de la
anteúltima secuencia (considerar comenzar a buscarla a partir de la ultima
posición de la row).*/

/*12. Write a program that, given the defined and preloaded array of character
sequences, allows you to find the start and end position of the next-to-last 
sequence for each row (consider starting to search for it from the last position 
of the row).*/

import java.util.Random;
public class P8_exercise12 {
  public static final int MAXROW = 4;
  public static final int MAXCOLUMN = 20;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static final double probabilidad_letra = 0.4;
  public static void main(String[] args) {
    char [][] matchar;
    matchar = new char [MAXROW][MAXCOLUMN];
    random_matriz_loading_sequences_char(matchar);
    print_matriz_char(matchar);
    print_start_end_penultime_sequence_matriz(matchar);
  }

  public static void print_start_end_penultime_sequence_matriz(char [][] mat){ 
    for(int row = 0; row < MAXROW; row++){
      iprint_start_end_penultime_sequence_array(mat[row]);
    }
  }

  public static void iprint_start_end_penultime_sequence_array(char [] arr){
    int end = MAXCOLUMN-1;
    int start = MAXCOLUMN;
    for(int pos = 0; pos < 2; pos++){
      end = get_end_sequence(arr, start-1); 
      if(end > 0){
        start = get_start_sequence(arr, end);
      }
    }
    System.out.println("From the penultimate sequence, the pos of start is "+start+" and of end "+end);
  }

  public static int get_start_sequence(char [] arr, int pos){
    while((pos > 0) && (arr[pos] != ' ')){
      pos--;
    }
    return pos+1;
  }

  public static int get_end_sequence(char [] arr, int pos){
    while((pos > 0) && (arr[pos] == ' ')){
      pos--;
    }
    return pos;
  }

  public static void random_matriz_loading_sequences_char(char [][] mat){
    for (int row = 0; row < MAXROW; row++){
    	random_array_loading_sequences_char(mat[row]);
    }
    System.out.println("");
  }	

  public static void print_matriz_char(char [][] mat){
    for (int row = 0; row < MAXROW; row++){
      print_array_sequences_char(mat[row]);
      System.out.println("");
    }
  }

   public static void print_array_sequences_char(char [] arr){
    for(int pos = 0; pos < MAXCOLUMN; pos++){
      System.out.print(arr[pos]+"|");
    }
    System.out.println(" ");
  }
  
  public static void random_array_loading_sequences_char(char [] arr){
    Random r = new Random();
    arr[0] = ' ';
    arr[MAXCOLUMN-1] = ' ';
    for (int pos = 1; pos < MAXCOLUMN-1; pos++){
      if (r.nextDouble()<probabilidad_letra){
      	arr[pos]=(char)(r.nextInt(26) + 'a');
      }
      else{
      	arr[pos]=' ';
      }
    }
  }
}
