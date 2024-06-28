package DSA.algorithms.primeNumbers;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Method2 {
  public static void main(String[] args) {
    List<Integer> primeNumbers = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int limit = s.nextInt();
    int number = 2;
    boolean isPrime;

    while (primeNumbers.size() < limit) {
      isPrime = true;

      for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) primeNumbers.add(number);
      number++;
    }
    
    System.out.println("The %s first prime numbers are:");
    System.out.println(primeNumbers);

    s.close();
  }  
}
