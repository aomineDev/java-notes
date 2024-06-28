package DSA.algorithms.binarySearch;


import java.util.Scanner;
import java.util.Arrays;

public class Method4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[] arr = {"ariel", "omar", "aomine"};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    System.out.println("What name do you want to find?");
    String target = s.nextLine().trim().toLowerCase();

    int res = binarySearch(arr, target);

    System.out.println("The index of " + target + " is " + res);

    s.close();
  }

  // binary search for string with while in a method
  static int binarySearch(String[] arr, String target) {
    int min = 0;
    int max = arr.length - 1;

    while (min <= max) {
      int mid = (min + max) / 2;
      int res = target.compareTo(arr[mid]);

      if (res == 0) return mid;
      else if (res > 0) min = mid + 1;
      else max = mid - 1; 
    }

    return -1;
  }
}
