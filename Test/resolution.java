/*Tema 1: Se tiene una matriz precargada con secuencias de enteros distintos de cero en sus filas. Se pide guardar en un arreglo los números de rows de las primeras 4 filas que cumplen con la condición de tener a lo sumo 5 secuencias sin orden ascendente.
Observaciones: _el tamaño arreglo es igual a la cantidad de filas de la matriz, y está inicializado con -1,
_las secuencias están separadas por uno o más ceros, empiezan y terminan con uno o más ceros,
_realizar el programa completo sin realizar métodos de carga e impresión de matriz, ni utilizar estructuras auxiliares.
*/

/*There is an array preloaded with sequences of nonzero integers in its rows. It is requested to save in an array the row numbers of the first 4 rows that meet the condition of having at most 5 sequences without ascending order.
Observations:
_the array size is equal to the number of rows in the array, and is initialized with -1,
_sequences are separated by one or more zeros, start and end with one or more zeros,
_make the complete program without carrying out matrix loading and printing methods, or using auxiliary structures. */


//my test resolution

public class tema1 {
  public static final int MAXF = 9;
  public static final int MAXC = 20;
  public static void main(String[] args) {
    int [][] matint  = {
      {0,1,2,3,0,3,0,0,6,5,7,6,0,7,0,3,3,0,0,0},//0 
      {0,5,2,0,6,4,0,8,6,0,9,7,6,0,5,2,0,3,2,0},//1 //6 no ascending order
      {0,1,2,3,0,3,0,0,6,5,7,6,0,7,0,3,3,0,0,0},//2
      {0,5,2,0,6,4,0,8,6,0,9,7,6,0,5,2,0,3,2,0},//3 //6 no ascending order
      {0,1,2,3,0,3,0,0,6,5,7,6,0,7,0,3,3,0,0,0},//4 
      {0,5,2,0,6,4,0,8,6,0,9,7,6,0,5,2,0,3,2,0},//5 //6 no ascending order
      {0,1,2,3,0,3,0,0,6,5,7,6,0,7,0,3,3,0,0,0},//6
      {0,1,2,3,0,3,0,0,6,5,7,6,0,7,0,3,3,0,0,0},//7
      {0,1,2,3,0,3,0,0,6,5,7,6,0,7,0,3,3,0,0,0}//8
    };
    int [] arrint = {-1, -1, -1, -1, -1, -1 ,-1 ,-1, -1};
    try{
      print_matriz_int(matint);
      print_arr_int(arrint);
      save_rows_meet_condition_matriz(matint, arrint);
      print_arr_int(arrint);
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
  
  public static void save_rows_meet_condition_matriz(int [][] mat, int [] arr){
    for(int row = 0; row < MAXF; row++){
      save_rows_meet_condition_arreglo(mat[row], arr, row);
    }
  }
  
  public static void save_rows_meet_condition_arreglo(int [] arr1, int [] arr2, int row){
    int amount = 0;
    int start = 0;
    int end = -1;
    while(start < MAXC){
      start = get_start_sequence(arr1, end+1);
      if(start < MAXC){
        end = get_end_sequence(arr1, start);
        if(non_ascending_sequence(arr1, start, end) == true){
          amount++;
        }
      }
    }
    if(amount <= 5){
      save_in_array2_row(arr2, row);
    }
  }
  
  public static boolean non_ascending_sequence(int [] arr, int start, int end){
  	boolean check = true;
    int i = start;
    while(i < end){
      if((arr[i] <= arr[i+1])&&(arr[start] != arr[end])){
        i++;
        if(i == end){
          check = false;
        }
      }else{
        i = end + 1 ;
      }
    }
    return check;
  }
  
  public static int get_start_sequence(int [] arr, int pos){
    while((pos < MAXC)&&(arr[pos] == 0)){
      pos++;
    }
    return pos;
  }
  
  public static int get_end_sequence(int [] arr, int pos){
    while((pos < MAXC) && (arr[pos] != 0)){
      pos++;
    }
    return pos-1;
  }
  
  public static void save_in_array2_row(int [] arr, int row){
    int i = 0;
    while(i < 4){
      if(arr[i] == -1){
        arr[i] = row;
        i = 4;
      }else{
        i++;
      }
    }
  }
  public static void print_matriz_int(int [][] mat){
    for(int row = 0; row < MAXF; row++){
      for(int col = 0; col < MAXC; col++){
      	System.out.print(mat[row][col]+"|");
      }
       System.out.println(" ");
    }
    System.out.println(" ");
  }
  public static void print_arr_int(int [] array) {
    for (int i = 0; i < MAXF; i++) {
      System.out.print("[" + array[i] + "]");
    }
    System.out.println(" ");
  }
}


//Note: 7
//My mistake was that the validation (of the entry of the first 4 rows) is proper to the array traversal, not to the array. The rest is correct







