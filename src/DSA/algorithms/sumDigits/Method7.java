package DSA.algorithms.sumDigits;

import java.util.Scanner;

public class Method7 {
  public static void main(String[] args) {
    int number, numberAux, sumOfDigits = 0;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a number:");
    number = numberAux = s.nextInt();

    while (numberAux > 0) {
      sumOfDigits += numberAux % 10;
      numberAux /= 10;
    }

    System.out.println("Sum of digits of " + number + ": " + sumOfDigits);
    
    s.close();
  }
}
