package DSA.algorithms.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Method3 {
  public static void main(String[] args) {
    int[] arr = {10, 24, 21, 55, 6, 12, 64, 37, 66, 1, 3, 54, 57 };
    Scanner s = new Scanner(System.in);

    Arrays.sort(arr);

    System.out.println(Arrays.toString(arr));
    System.out.println("What number do you want to find?");
    int target = s.nextInt();

    int res = binarySearch(arr, target);

    System.out.println("The index of " + target + " is " + res);

    s.close();
  }

  // binary search for int numbers with recursivity 
  static int binarySearch (int [] arr, int target) {
    return binarySearchRecursivity(arr, target, 0, arr.length - 1);
  }

  static int binarySearchRecursivity(int [] arr, int target, int min, int max) {
    if (min > max) return -1;

    int mid = (min + max) / 2;

    if (target == arr[mid]) return mid;
    else if (target > arr[mid]) min = mid + 1;
    else  max = mid - 1;
  
    return binarySearchRecursivity(arr, target, min, max);
  }
}
