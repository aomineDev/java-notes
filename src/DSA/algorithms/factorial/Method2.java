package DSA.algorithms.factorial;

import java.util.Scanner;

public class Method2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter an integer number");
    int n = s.nextInt();

    int f = n == 0 ? 1 : factorial(n);

    System.out.println(n + "! = " + f);

    s.close();
  } 

  static int factorial(int n) {
    if (n == 1) return n;
    return n * factorial(n - 1);
  }
}
