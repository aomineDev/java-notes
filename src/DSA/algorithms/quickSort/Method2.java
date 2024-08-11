package DSA.algorithms.quickSort;

import java.util.Arrays;

public class Method2 {
  public static void main(String[] args) {
    String[] arr = {"ariel", "Omar", "aomine", "akashi", "kiyotaka", "marco", "shiro hige"};

    System.out.println("Initial array:");
    System.out.println(Arrays.toString(arr));

    String[] arrSorted = quickSort(arr);

    System.out.println();
    System.out.println("Array sorted:");
    System.out.println(Arrays.toString(arrSorted));
  }

  static void swap(String[] arr, int a, int b) {
    String temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  static int partition(String[] arr, int low, int high) {
    String pivot = arr[high];
    int i = low;

    for(int j = low; j < high; j++) {
      int res = arr[j].compareTo(pivot);

      if (res < 0) {
        swap(arr, i, j);
        i++;
      }
    }

    swap(arr, i, high);

    return i;
  }

  static void quickSortRecursive(String[] arr, int low, int high) {
    if(!(high > low)) return;

    int pi = partition(arr, low, high);

    quickSortRecursive(arr, low, pi - 1);
    quickSortRecursive(arr, pi + 1, high);
  }

  static String[] quickSort (String[] arr) {
    String[] newArr = clone(arr);

    quickSortRecursive(newArr, 0, arr.length - 1);

    return newArr;
  } 

  static String[] clone (String[] arr) {
    String[] newArr = new String[arr.length];

    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }

    return newArr;
  } 
}
