package DSA.dataStructure.arrayToCollections.intArrayToList;

import java.util.List;
import java.util.Arrays;

public class Method1 {
  public static void main(String[] args) {
    int[] numbers = {20, 15, 12, 14, 18, 23, 11, 7, 45, 32, 17};

    List<Integer> numberList = Arrays.stream(numbers).boxed().toList();

    System.out.println(numberList);
  }
}
