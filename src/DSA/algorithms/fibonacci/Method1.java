package DSA.algorithms.fibonacci;

import java.util.Scanner;

public class Method1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the posicion of the fibonacci series you are looking for: ");
    int pos = s.nextInt();

    int val = fibonacci(pos);

    System.out.println("value of the position " + pos + ": " + val);

    s.close();
  }

  static int fibonacci (int pos) {
    if (pos == 1) return 0;
    else if (pos == 2) return 1;
    else return fibonacci(pos - 1) + fibonacci(pos - 2);
  }
}
