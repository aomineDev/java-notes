package DSA.algorithms.quickSort;

import java.util.Arrays;

public class Method1 {
  public static void main(String[] args) {
    int[] arr = { 7, 2, 4, 3, 12, 5, 54, 5, 7, 6, 1, 43, 23, 123, 98, 34, 53, 4, 534, 12, 3 };

    System.out.println("Initial array:");
    System.out.println(Arrays.toString(arr));

    int[] arrSorted = quickSort(arr);
    
    System.out.println();
    System.out.println("Array sorted:");
    System.out.println(Arrays.toString(arrSorted));
  }

  static void swap (int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low;

    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        swap(arr, i, j);
        i++;
      }
    }

    swap(arr, i, high);

    return i;
  }

  static void quickSortRecursive (int[] arr, int low, int high) {
    if (!(low < high)) return;

    int pi = partition(arr, low, high);

    quickSortRecursive(arr, low, pi - 1);
    quickSortRecursive(arr, pi + 1, high);
  }

  static int[] quickSort (int arr[]) {
    int[] newArr = clone(arr);

    quickSortRecursive(newArr, 0, newArr.length - 1);

    return newArr;
  }

  static int[] clone (int[] arr) {
    int[] newArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }

    return newArr;
  }
}
