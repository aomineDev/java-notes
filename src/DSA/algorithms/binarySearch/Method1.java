package DSA.algorithms.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Method1 {
  public static void main(String[] args) {
    int[] arr = {10, 24, 21, 55, 2, 12, 64, 37, 66, 1, 3, 54, 57 };
    Scanner s = new Scanner(System.in);

    Arrays.sort(arr);

    System.out.println(Arrays.toString(arr));
    System.out.println("What number do you want to find?");
    int target = s.nextInt();
    
    int min = 0;
    int max = arr.length - 1;
    int mid = 0;

    // binary search for int numbers with while
    while (min <= max) {
      mid = (max + min) / 2;

      if (target == arr[mid]) break;
      else if (target > arr[mid]) min = mid + 1;
      else  max = mid - 1;

      if (min > max)  mid = -1;
    }

    System.out.println("The index of " + target + " is " + mid);

    s.close();
  }
}
