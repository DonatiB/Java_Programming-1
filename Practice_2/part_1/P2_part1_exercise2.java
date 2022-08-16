/*2. Escribir un programa que declare tres variables de tipo double y
una constante de tipo double con valor 1.0 . Luego deberá
asignar el valor de la constante a una de la variables declaradas,
y posteriormente sobre las dos restantes variables se le deberá
asignar el valor de la variable que inicialmente fue seteada con el
valor de la constante. Finalmente imprima por pantalla cada una
de las variables.*/
/*2. Write a program that declares three variables of type double and
a constant of type double with value 1.0 . Then you must
assign the value of the constant to one of the declared variables,
and later on the two remaining variables you must
assign the value of the variable that was initially set with the
constant value. Finally print each one
of the variables.*/

public class P2_part1_exercise2 {
  public static void main(String[] args) {
    
    double variable1 = 0.1;
    double variable2 = 0.2;
    double variable3 = 0.3;
    final double constant = 1.0;
    
    double auxVariable1;
    auxVariable1 = variable1;
    
    variable1 = constant;
    variable2 = auxVariable1;
    variable3 = auxVariable1;
    
    System.out.println("Variable 1: " + variable1);
    System.out.println("Variable 2: " + variable2);
    System.out.println("Variable 3: " + variable3);
    System.out.println("Constant: " + constant);
  }
}
