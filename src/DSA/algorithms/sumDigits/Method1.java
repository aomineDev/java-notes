package DSA.algorithms.sumDigits;

import java.util.Scanner;

class Method1 {
  public static void main(String[] args) {
    int number, numberAux, numberOfDigits = 0, sumOfDigits = 0;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a number:");
    number = numberAux = s.nextInt();

    if (number == 0) {
      numberOfDigits++;
    } else {
      while (numberAux != 0) {
        numberAux /= 10;
        numberOfDigits++;
      }
    }

    System.out.println("Number of digits: " + numberOfDigits);
    
    numberAux = number;

    for (int i = numberOfDigits - 1; i >= 0; i--) {
      int reductor = (int) Math.pow(10, i);
      int digit = numberAux / reductor;
      numberAux -= digit * reductor;

      sumOfDigits += digit;
    }

    System.out.println("Sum of digits of " + number + ": " + sumOfDigits);

    s.close();
  }
}