package DSA.dataStructure.arrayToCollections.arrayToSet;

import java.util.HashSet;
import java.util.Arrays;

public class Method4 {
  public static void main(String[] args) {
    int[] values = {1, 2, 3, 1};
    HashSet<Integer> numberSet = new HashSet<>();
    
    numberSet.addAll(Arrays.stream(values).boxed().toList());

    System.out.println(numberSet);
  }
}
