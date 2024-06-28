package DSA.dataStructure.arrayToCollections.arrayToSet;

import java.util.HashSet;
import java.util.Arrays;

public class Method1 {
  public static void main(String[] args) {
    int[] values = {1, 2, 3, 1};
    HashSet<Integer> numberSet = new HashSet<>(Arrays.stream(values).boxed().toList());
    
    System.out.println(numberSet);
  }
}
