package DSA.algorithms.sort;

import java.util.Arrays;

public class BoobleSort {
  public static void main(String[] args) {
    int[] numbers = { 7, 2, 4, 3, 12, 5, 54, 5, 7, 6, 1, 43, 23, 123, 98, 34, 53, 4, 534, 12, 3 };
    System.out.println(Arrays.toString(numbers));

    int len = numbers.length;
    for (int i = 0; i < len - 1; i++) {
      boolean swapped = false;
      for (int j = 0; j < len - i - 1; j++) {
        if (numbers[j] > numbers[j + 1]) {
          swapped = true;
          int temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }

      if (!swapped)
        break;
    }

    System.out.println(Arrays.toString(numbers));
  }
}
