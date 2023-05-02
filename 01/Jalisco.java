import java.util.*;
/**
 * Jalisco never lose
 */

class Jalisco {
  public static void main(String[] args){
    Scanner sc;
    sc = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    int userNumber;
    userNumber = sc.nextInt();
    int myNumber;
    myNumber = userNumber + 1;
    System.out.println("Te gano con el: " + myNumber);
  }
}
