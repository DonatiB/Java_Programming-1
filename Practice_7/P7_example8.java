import java.util.Random;
public class P7_example8 {
  public static final int MAX = 20;
  public static final int MAXVALUE = 9;
  public static final int MINVALUE = 1;
  public static final double probability_number = 0.4;
  public static void main(String[] args) {
    int[] arr;
    arr = new int[MAX];
    random_sequence_arr_loading_int(arr); //we reuse
    print_arr_sequences_int(arr); //we reuse
    print_sum_each_sequence(arr);
  }
  public static void print_sum_each_sequence(int[] arr){
      int start,end,sum;
      start = 0;
      end = -1;
      while ((start < MAX)){
        start = get_start_sequence(arr,end+1); //we reuse
        System.out.println("start"+start);
        if (start < MAX){
          end = get_end_sequence(arr,start); //we reuse
          System.out.println("end"+end);
          sum = get_sum_sequence(arr,start,end);
          System.out.println("the sum of the sequence from "+start+" to "+end+" is "+sum);
        }
      }
  }
  public static int get_start_sequence(int [ ] arr, int pos) {
    while ((pos < MAX) && (arr[pos] == 0)) {
      pos++;
    }
    return pos;
  }

  public static int get_end_sequence(int [ ] arr, int pos) {
    while ((pos < MAX) && (arr[pos] != 0)) {
      pos++;
    }
    return pos - 1;
  }
  public static int get_sum_sequence(int[] arr, int start, int end){
      int sum = 0;
      while (start <= end){
        sum+=arr[start];
        start++;
      }
      return sum;
  }
  public static void random_sequence_arr_loading_int(int [] arr){
    Random r = new Random();
    arr[0] = 0;
    arr[MAX-1] = 0;
    for(int pos = 1; pos < MAX-1; pos++){
      if(r.nextDouble()<probability_number){
        arr[pos]=(r.nextInt(MAXVALUE-MINVALUE+1) + MINVALUE);
      }
    }
  }
  
  public static void print_arr_sequences_int(int [] arr){
    System.out.println("Array of integer sequences\n");
    for(int pos = 0; pos < MAX; pos++){
      System.out.print(arr[pos] + "|");
    }
    System.out.println(" ");
  }
}