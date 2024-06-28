package DSA.algorithms.capicua;

import java.util.Scanner;

public class Method1 {
  public static void main(String[] args) {
    int n, d1, d3;
    String res;
    Scanner s = new Scanner(System.in);

    System.out.println("enter a 3 digit number: ");
    n = s.nextInt();

    d1 = n / 100;
    d3 = n % 10;

    res = d1 == d3 ? "is" : "isn't";

    System.out.println("the number " + n + " " + res + " capicua");

    s.close();
  }
}
