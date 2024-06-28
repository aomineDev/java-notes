package DSA.dataStructure.arrayToCollections.arrayToSet;

import java.util.HashSet;

public class Method3 {
  public static void main(String[] args) {
    int[] values = {1, 2, 3, 1};
    HashSet<Integer> numberSet = new HashSet<>();
    
    for (int value : values) numberSet.add(value);
    
    System.out.println(numberSet);
  }
}
