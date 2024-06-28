package functionalProgramming.filter.filterIntArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Method2 {
  public static void main(String[] args) {
    int[] numbers = {20, 15, 12, 14, 18, 23, 11, 7, 45, 32, 17};
    
    int[] numbersFilter = IntStream.of(numbers)
      .filter(v -> v >= 18)
      .toArray();

    System.out.println(Arrays.toString(numbersFilter));
  } 
}
