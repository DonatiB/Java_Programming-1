/*16. Hay dos matrices MAT1 y MAT2 de secuencias de caracteres letras separados
por espacios de tamaño MAXF x MAXC que están precargadas. Ambas
matrices están precargadas y cada row empieza y termina con caracteres
espacios. Además se tiene el siguiente método:
– un método que retorna el índice inicial de la secuencia de Largest tamaño de un
arreglo de secuencias (de caracteres letras minúsculas separados por espacios) de
tamaño MAXFIL.
Se pide realizar un programa que
1– contenga la definición de los encabezados de los métodos de carga de la matriz y
del método mencionado en el enunciado (se supone que existen y no se requiere
implementarlos).
2– para MAT1 y MAT2 elimine de cada secuencia el primer carácter vocal.
3– para MAT1 agregue al principio de cada secuencia el primer carácter de la
secuencia de Largest tamaño de dicha row.
4– en cada row, si se verifica que la secuencia de Largest tamaño de la row para MAT1 es
Largest que la primer secuencia en dicha row para MAT2, las intercambie (la que está
en MAT1 pasa a MAT2 y la que esta en MAT2 pasa a MAT1) sin usar estructuras
auxiliares (otros arreglos o matrices).
5– para un valor de row ingresado por el usuario verifique e imprima si la primera
secuencia de MAT1 en dicha row es igual la primera secuencia de MAT2 en dicha row.*/

/*16. There are two arrays MAT1 and MAT2 of space-separated sequences of letter characters 
of size MAXF x MAXC that are preloaded. Both arrays are prefilled and each row begins and 
ends with space characters. In addition, there is the following method:
– a method that returns the initial index of the largest sequence of an array of sequences
(of lowercase letter characters separated by spaces) of size MAXFIL.
You are asked to create a program that:
1– contains the definition of the headers of the array loading methods and of the method 
mentioned in the statement (they are assumed to exist and are not required to be implemented).
2– for MAT1 and MAT2 delete the first vowel character from each sequence.
3 – for MAT1 add to the beginning of each sequence the first character of the largest sequence in that row.
4– in each row, if it is verified that the largest sequence in the row for MAT1 is greater than
the first sequence in that row for MAT2, swap them (the one in MAT1 goes to MAT2 and the one 
in MAT2 goes to MAT1) without using auxiliary structures (other arrays or matrices).
5– for a user-entered row value check and print if the first sequence of MAT1 in that row is 
equal to the first sequence of MAT2 in that row.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P8_exercise16 {
  public static final int MAXROW = 4;
  public static final int MAXCOLUMN = 20;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static final double probability_letter = 0.4;
  public static void main(String[] args) {
    char [][] MAT1 = new char [MAXROW][MAXCOLUMN];
    char [][] MAT2 = new char [MAXROW][MAXCOLUMN];
    int row;
    boolean verify;
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    try{
        random_matriz_loading_sequences_char(MAT1);
        random_matriz_loading_sequences_char(MAT2);
        print_matriz_char(MAT1);
        print_matriz_char(MAT2);
        delete_first_character_vowel_matriz(MAT1);
        delete_first_character_vowel_matriz(MAT2);
        add_start_largest_sequence_matriz(MAT1);
        exchange_sequences_matriz(MAT1, MAT2);
        System.out.println("Enter a row number: ");
        row = Integer.valueOf(entry.readLine());
        if((row >= 0)&&(row < MAXROW)){
          print_verify(MAT1[row], MAT2[row], row);
        }
        print_matriz_char(MAT1);
        print_matriz_char(MAT2);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
    
  }
  
  //5– for a user-entered row value check and print if the first sequence of MAT1 in that row is equal to the first sequence of MAT2 in that row.*/
  public static void print_verify(char [] arr1, char [] arr2, int row){
    boolean verify = check_equality_first_row_sequence(arr1, arr2);
    if(verify == true){
      System.out.println("The first sequendes of row "+row+" for MAT1 is equal to the first sequence of MAT2");
    }else{
      System.out.println("The first sequendes of row "+row+" for MAT1 is different from the first sequence of MAT2");
    }
  }
  public static boolean check_equality_first_row_sequence(char [] arr1, char [] arr2){
    boolean verify = false;
    int start1 = 0;
    int end1 = -1;
    int start2 = 0;
    int end2 = -1;
    if((start1 < MAXCOLUMN)&&(start2 < MAXCOLUMN)){
      start1 = get_start_sequence(arr1, end1+1);
      start2 = get_start_sequence(arr2, end2+1);
      if((start1 < MAXCOLUMN)&&(start2 < MAXCOLUMN)){
        end1 = get_end_sequence(arr1, start1);
        end2 = get_end_sequence(arr2, start2);
        if(check_equality(arr1, arr2, start1, start2, end1, end2) == true){
          verify = true;
        }
      }
    }
    return verify;
  }
  
  public static boolean check_equality(char [] arr1, char [] arr2, int start1, int start2, int end1, int end2){
     boolean verificar = false;
     int i = start1;
     int j = start2;
     while(i <= end1){
       if(arr1[i] == arr2[j]){
         if(i == end1){
           verificar = true;
         }
         i++;
         j++;
         
       }else{
         i = end1 + 1;
         verificar = false;
       }
     }
     return verificar;
  }  

  //4– in each row, if it is verified that the largest sequence in the row for MAT1 is greater than the first sequence in that row for MAT2, swap them (the one in MAT1 goes to MAT2 and the one in MAT2 goes to MAT1) without using auxiliary structures (other arrays or matrices).
  public static void exchange_sequences_matriz(char [][] mat1, char [][] mat2){
    for(int row = 0; row < MAXROW; row++){
     	 exchange_sequences_arr(mat1[row], mat2[row]);
    }
  }
  public static void exchange_sequences_arr(char [] arr1, char [] arr2){
    int start1 = get_start_sequence_Largest_arreglo(arr1);
    int start2 = 0;
    int end1 = 0;
    int end2 = -1;
    if(start1 < MAXCOLUMN){
      end1 = get_end_sequence(arr1, start1);
    }
    
    if(start2 < MAXCOLUMN){
      start2 = get_start_sequence(arr2, end2+1);
      if(start2 < MAXCOLUMN){
        end2 = get_end_sequence(arr2, start2);
      }
    }
    int dif;
    if((end1 - start1 + 1) > (end2 - start2 + 1)){
        dif = (end1 - start1 + 1) - (end2 - start2 + 1);
        corrimiento_der(arr2, end2, dif);
    	intercambiar_secuencias(arr1, arr2, start1, start2, end1, end2, dif);
    } 
  }
  public static void corrimiento_der(char [] arr2, int end2, int dif){
    for(int i = MAXCOLUMN-1; i > end2 + dif; i--){
      arr2[i] = arr2[i-1];
    }
  }
  public static void intercambiar_secuencias(char [] arr1, char [] arr2, int start1, int start2, int end1, int end2, int dif){
    char aux;
    int j = start2;
    for(int i = start1; i <= end1; i++){
      aux = arr1[i];
      arr1[i] = arr2[j];
      arr2[j] = aux;
      j++;
    }
  }
  
//3 – for MAT1 add to the beginning of each sequence the first character of the largest sequence in that row.
  public static void add_start_largest_sequence_matriz(char [][] mat){
    for(int row = 0; row < MAXROW; row++){
      add_start_largest_sequence_arr(mat[row]);
    }
  }
  public static void add_start_largest_sequence_arr(char [] arr){
    int start = 0;
    int end = -1;
    int startLargest;
    while(start < MAXCOLUMN){
      start = get_start_sequence(arr, end+1);
      if(start < MAXCOLUMN){
        end = get_end_sequence(arr, start);
        startLargest = get_start_largest_sequence(arr);
        arr[start] = arr[startLargest]; 
      }
    }
  }
  public static int get_start_largest_sequence(char [] arr){
    int start = 0;
    int end = -1;
    int size = 0;
    int auxsize = 0;
    int startLargest = 0;
    while(start < MAXCOLUMN){
      start = get_start_sequence(arr, end+1);
      if(start < MAXCOLUMN){
        end = get_end_sequence(arr, start);
        size = end - start + 1;
        if(size > auxsize){
          auxsize = size;
          startLargest = start;
        }
      }
    }
    return startLargest;
  }
  
  //2– for MAT1 and MAT2 delete the first vowel character from each sequence.
  public static void delete_first_character_vowel_matriz(char [][] mat){
    for(int row = 0; row < MAXROW; row++){
      delete_first_character_vowel_arr(mat[row]);
    }
  }
  public static void delete_first_character_vowel_arr(char [] arr){
    int start = 0;
    int end = -1;
    while(start < MAXCOLUMN){
      start = get_start_sequence(arr, end+1);
      if(start <  MAXCOLUMN){
        end = get_end_sequence(arr, start);
        eliminar_primer_vocal_secuencia(arr, start, end);
      }
    }
  }
  public static void eliminar_primer_vocal_secuencia(char [] arr, int start, int end){
    for(int i = start; i <= end; i++){
      if((arr[i] == 'a')||(arr[i] == 'e')||(arr[i] == 'i')||(arr[i] == 'o')||(arr[i] == 'u')){
        shift_left(arr, i);
        i = end + 1;
      }	
    }
  }
  public static void shift_left(char [] arr, int start){
    for(int i = start; i < MAXCOLUMN-1; i++){
      arr[i] = arr[i+1];
    }
  } 
  public static int get_end_sequence(char [] arr, int pos){
    while((pos < MAXCOLUMN) && (arr[pos] != ' ')){
      pos++;
    }
    return pos-1;
  }
  public static int get_start_sequence(char [] arr, int pos){
    while((pos < MAXCOLUMN) && (arr[pos] == ' ')){
      pos++;
    }
    return pos;
  }
  
  //1– contains the definition of the headers of the array loading methods and of the method mentioned in the statement (they are assumed to exist and are not required to be implemented).
  public static int get_start_sequence_Largest_arreglo(char [] arr){
    int start = 0;
    int end = -1;
    int startLargest = 0;
    int size = 0;
    int sizeLargest = 0;
    while(start < MAXCOLUMN){
      start = get_start_sequence(arr, end+1);
      if(start < MAXCOLUMN){
        end = get_end_sequence(arr, start);
        size = end - start + 1;
        if(size > sizeLargest){
          sizeLargest = size;
          startLargest = start;
        }
      }
    }
    return startLargest;
  }
  
  public static void random_matriz_loading_sequences_char(char [][] mat){
    for (int row = 0; row < MAXROW; row++){
    	random_arr_loading_sequences_char(mat[row]);
    }
    System.out.println("");
  }	
  public static void print_matriz_char(char [][] mat){
    for (int row = 0; row < MAXROW; row++){
      print_sequences_arr_char(mat[row]);
      System.out.println("");
    }
  }
   public static void print_sequences_arr_char(char [] arr){
    for(int pos = 0; pos < MAXCOLUMN; pos++){
      System.out.print(arr[pos]+"|");
    }
    System.out.println(" ");
  }
  
  public static void random_arr_loading_sequences_char(char [] arr){
    Random r = new Random();
    arr[0] = ' ';
    arr[MAXCOLUMN-1] = ' ';
    for (int pos = 1; pos < MAXCOLUMN-1; pos++){
      if (r.nextDouble()<probability_letter){
      	arr[pos]=(char)(r.nextInt(26) + 'a');
      }
      else{
      	arr[pos]=' ';
      }
    }
  }
  
}
