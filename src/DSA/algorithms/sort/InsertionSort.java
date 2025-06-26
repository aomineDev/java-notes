package DSA.algorithms.sort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
  public static void main(String[] args) {
    int[] numbers = new int[20];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = new Random().nextInt(100);
    }

    System.out.println(Arrays.toString(numbers));
    insertionSort(numbers);
    System.out.println(Arrays.toString(numbers));

  }

  public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int value = arr[i];
      int j = i - 1;

      while (j >= 0 && value < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }

      arr[j + 1] = value;
    }
  }
}