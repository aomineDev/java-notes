package DSA.algorithms.Tree;

import java.util.Scanner;

public class Method1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter the height of the Tree: ");
    final int n = s.nextInt();

    int value = 1;

    for (int i = 0; i < n; i++) {
      System.out.printf("%d%n", value);

      value = (value * 10) + 1;
    }

    s.close();
  }
}
