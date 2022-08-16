/*3. Escribir un programa que pida que se ingresen datos necesarios para emitir una
factura por la compra de dos artículos de librería (tipo factura, número, nombre
cliente, producto 1, importe 1, producto 2, importe 2, importe total). Como
salida debe imprimir por pantalla la factura en un formato similar al siguiente
(utilizar literales):


Factura             C                   201
Nombre y Apellido   Jorge Rodríguez
Producto                                Importe
Lápices                                 12.2
Cuadernos                               20.0
Importe Total                           30.2 
*/

/*3. Write a program that asks for the necessary data to be entered 
to issue an invoice for the purchase of two stationery items 
(invoice type, number, customer name, product 1, amount 1, product 2, amount 2, total amount). 
As output, you must print the invoice on the screen in a format similar to 
the following (use literals): 

Invoice             C                   201
Name and Surname    Jorge Rodriguez
Product                                 Amount
pencils                                 12.2
Notebooks                               20.0
Total amount                            30.2
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2_part2_exercise3 {
  public static void main(String[] args) {
    char invoice_type;
    int invoice_number;
    String name, product1, product2;
    double amount1, amount2, amount_total;
    
    try{
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Invoice type:");
      invoice_type = entrada.readLine().charAt(0);
      System.out.println("Invoice number:");
      invoice_number = Integer.valueOf(entrada.readLine());
      System.out.println("Name and surname:");
      name = entrada.readLine();
      System.out.println("Product 1:");
      product1 = entrada.readLine();
      System.out.println("Amount 1:");
      amount1 = Double.valueOf(entrada.readLine());
      System.out.println("Product 2:");
      product2 = entrada.readLine();
      System.out.println("amount 2:");
      amount2 = Double.valueOf(entrada.readLine());
      
      amount_total = amount1 + amount2;
      
      System.out.println("\f");
      System.out.println("Factura " + "\t\t\t" + invoice_type + "\t\t\t " + invoice_number);
      System.out.println("Nombre y Apellido " + "\t\t" + name);
      System.out.println("Product \t\t\t\t\t\t Importe");
      System.out.println(product1 + " \t\t\t\t\t\t " + amount1 + "\n" + product2 + " \t\t\t\t\t\t " + amount2);
      System.out.println("Importe Total " + " \t\t\t\t\t\t " + amount_total);
      
    }
    catch(Exception exc){
      System.out.println(exc);
    }
    
  }
}
