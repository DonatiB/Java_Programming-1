/*15. Hacer un programa que dado el arreglo definido y precargado elimine del arreglo
todas las ocurrencias de una secuencia patrón dada por otro arreglo de iguales
características (solo tiene esa secuencia). Al eliminar se pierden valores haciendo
corrimientos.*/

/*15. Make a program that, given the defined and preloaded array, eliminates from 
the array all the occurrences of a pattern sequence given by another array with the 
same characteristics (it only has that sequence). When deleting, values are lost making shifts.*/

public class P7_exercise15 {
  public static final int MAX = 20;
  public static void main(String[] args) {
	int [] arrint = {0,1,2,0,3,4,5,0,6,5,7,0,3,4,5,0,1,2,3,0}; // = new int [MAX];
    int [] arrpattern = {0,0,0,0,0,3,4,5,0,0,0,0,0,0,0,0,0,0,0,0}; // = new int [MAX];
    print_arr_sequences_int(arrint);
    remove_sequences_pattern(arrint, arrpattern);
    print_arr_sequences_int(arrpattern );
    print_arr_sequences_int(arrint);
  }
  
  public static void remove_sequences_pattern(int [] arrint, int [] arrpattern){
    int start = 0;
    int end = -1;
    while(start < MAX){
      start = get_start_sequence(arrint, end+1);
      if(start < MAX){
        end = get_end_sequence(arrint, start);
     	if(compare_sequences(arrint, arrpattern, start, end)==true){
          remove_sequence(arrint, start, end);
        }
        
      }
    }
  }
  
  public static boolean compare_sequences(int [] arrint, int [] arrpattern, int start, int end){
    boolean check = false;
    int startPattern = 0;
    int endPàttern = -1;
    while(startPattern < MAX){
       startPattern = get_start_sequence(arrpattern, endPàttern+1);
       if(startPattern < MAX){
         endPàttern = get_end_sequence(arrpattern, startPattern);
         if((arrint[start] == arrpattern[startPattern])&&(arrint[end] == arrpattern[endPàttern])){
      		check = true;
   		 }
       }
    }
    return check;
  }
  
  public static void remove_sequence(int [] arrint, int start, int end){
    for(int pos = start; pos <= end; pos++){
      shift_left(arrint, start);
    }
  }
  
  
  public static void shift_left(int [] arrint, int pos){
    for(int i = pos; i < MAX-1; i++){
      arrint[i] = arrint[i+1];
    }
  }
  
   
  
  public static int get_end_sequence(int [] arr, int pos){
    while((pos < MAX) &&(arr[pos] != 0)){
      pos++;
    }
    return pos-1;
  }
  
  public static int get_start_sequence(int [] arr, int pos){
    while((pos < MAX) && (arr[pos] == 0)){
      pos++;
    }
    return pos;
  }
  
  public static void print_arr_sequences_int(int [] arr){
    for(int pos = 0; pos < MAX; pos++){
      System.out.print(arr[pos] + "|");
    }
    System.out.println(" ");
  }
}
