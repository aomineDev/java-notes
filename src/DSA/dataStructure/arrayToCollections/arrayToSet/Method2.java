package DSA.dataStructure.arrayToCollections.arrayToSet;

import java.util.HashSet;
import java.util.stream.IntStream;

public class Method2 {
  public static void main(String[] args) {
    int[] values = {1, 2, 3, 1};
    HashSet<Integer> numberSet = new HashSet<>(IntStream.of(values).boxed().toList());
    
    for (int value : values) numberSet.add(value);

    System.out.println(numberSet);
  }
}
