package DSA.algorithms.fibonacci;

import java.util.Scanner;

public class Method2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the number of: ");
    int n = s.nextInt();

    int fib = 1, prev = 0, temp, sum = fib; 
    String fibS = fib + ", ";

    for(int i = 1; i < n; i++) {
      temp = fib;
      fib += prev;
      prev = temp;
      sum += fib;
      fibS += fib + ", ";
    }

    System.out.println("First " + n + " numbers of fibonacci series: " + fibS.substring(0, fibS.length() - 2));
    System.out.println("The number in the position " + n + " of fibonacci series is: " + fib);
    System.out.println("Sum of the first " + n + " numbers of fibonacci series: " + sum);

    s.close();
  }
}
