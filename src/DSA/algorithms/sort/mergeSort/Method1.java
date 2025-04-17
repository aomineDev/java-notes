package DSA.algorithms.sort.mergeSort;

import java.util.Arrays;

public class Method1 {
  public static void main(String[] args) {
    int[] numbers = { 8, 4, 1, 2, 5, 3, 1, 6, 7, 0, 3, 9 };

    int[] sortedNumbers = mergeSort(numbers);

    System.out.println("Initial array:");
    System.out.println(Arrays.toString(numbers));

    System.out.println();
    System.out.println("Array sorted:");
    System.out.println(Arrays.toString(sortedNumbers));
  }

  static int[] mergeSort(int[] arr) {
    int[] array = clone(arr);

    mergeRecursion(array, array.length);

    return array;
  }

  static void mergeRecursion(int[] arr, int n) {
    if (n < 2)
      return;

    int mid = n / 2;
    int rest = n - mid;
    int[] l = new int[mid];
    int[] r = new int[rest];

    for (int i = 0; i < mid; i++)
      l[i] = arr[i];

    for (int i = mid; i < n; i++)
      r[i - mid] = arr[i];

    mergeRecursion(l, mid);
    mergeRecursion(r, rest);

    merge(arr, l, r, mid, rest);
  }

  static void merge(int[] arr, int[] l, int[] r, int left, int right) {
    int i = 0, j = 0;

    for (int k = 0; k < arr.length; k++) {
      if (i == left) {
        arr[k] = r[j++];
      } else if (j == right) {
        arr[k] = l[i++];
      } else if (l[i] < r[j]) {
        arr[k] = l[i++];
      } else {
        arr[k] = r[j++];
      }
    }
  }

  static int[] clone(int[] arr) {
    int[] clonedArr = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      clonedArr[i] = arr[i];
    }

    return clonedArr;
  }
}
