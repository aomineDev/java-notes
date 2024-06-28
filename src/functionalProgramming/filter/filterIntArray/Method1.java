package functionalProgramming.filter.filterIntArray;

import java.util.Arrays;

public class Method1 {
  public static void main(String[] args) {
    int[] numbers = {20, 15, 12, 14, 18, 23, 11, 7, 45, 32, 17};
    
    int[] numbersFilter = Arrays.stream(numbers)
      .filter(v -> v >= 18)
      .toArray();

    System.out.println(Arrays.toString(numbersFilter));
  }
}
