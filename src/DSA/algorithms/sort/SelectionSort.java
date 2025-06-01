package DSA.algorithms.sort;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] numbers = { 7, 2, 4, 3, 12, 5, 54, 5, 7, 6, 1, 43, 23, 123, 98, 34, 53, 4, 534, 12, 3 };
    System.out.println(Arrays.toString(numbers));

    for (int i = 0; i < numbers.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[j] < numbers[min])
          min = j;
      }

      if (i != min) {
        int aux = numbers[i];
        numbers[i] = numbers[min];
        numbers[min] = aux;
      }
    }

    System.out.println(Arrays.toString(numbers));
  }
}
