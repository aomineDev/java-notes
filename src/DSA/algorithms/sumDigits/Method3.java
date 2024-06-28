package DSA.algorithms.sumDigits;

import java.util.Scanner;

public class Method3 {
  public static void main(String[] args) {
    String number;
    int sumOfDigits = 0;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a number:");
    number = s.nextLine();
    char[] numberArr = number.toCharArray();

    for (char n: numberArr) {
      int digit = Integer.parseInt(Character.toString(n));
      sumOfDigits += digit;
    }

    System.out.println("Sum of digits of " + number + ": " + sumOfDigits);

    s.close();
  }
}
