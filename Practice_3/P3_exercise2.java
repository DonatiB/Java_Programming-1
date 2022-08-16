/*2. Escribir un programa que imprima por pantalla la tabla de valores de
verdad para el or y and por separado. Por ejemplo, imprimir el siguiente
caso del or

System.out.println(“ false or true es: ”+(false || true));
*/

/*2. Write a program that prints on the screen the table of truth 
values for or and and separately. For example, print the following case of or:

System.out.println(“ false or true is: ”+(false || true));
*/

public class P3_exercise2 {
  public static void main(String[] args) {
    try{
      //table of values for AND
      System.out.println("True and True: " + (true && true));
      System.out.println("True and False: " + (true && false));
      System.out.println("False and False: " + (false && false));
      
      //tatable of values for OR
      System.out.println("True or True: " + (true || true));
      System.out.println("True or False: " + (true || false));
      System.out.println("False or False: " + (false || false));
    }
    catch(Exception exc){
      System.out.println(exc);
    }
  }
}