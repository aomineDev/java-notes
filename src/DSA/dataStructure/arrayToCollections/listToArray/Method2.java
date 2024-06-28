package DSA.dataStructure.arrayToCollections.listToArray;

import java.util.List;
import java.util.Arrays;

public class Method2 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    
    int[] arrNumbers = numbers.stream().mapToInt(Integer::intValue).toArray();

    System.out.println(Arrays.toString(arrNumbers));
  }
}
