package DSA.algorithms.factorial;

import java.util.Scanner;

public class Method1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int f = 1;

    System.out.println("Enter an integer number: ");
    int n = s.nextInt();

    for (int i = 1; i <= n; i++) f *= i;
    
    System.out.println(n + "! = " + f);

    s.close();
  }
}
