package DSA.algorithms.primeNumbers;

import java.util.Scanner;

public class Method1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = s.nextInt();
    boolean isPrime = number <= 1 ? false : true;
    
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        isPrime = false;
        break;
      }
    }

    String response = isPrime ? "is" : "isn't";

    System.out.printf("The number %s %s prime", number, response);

    s.close();
  }  
}
