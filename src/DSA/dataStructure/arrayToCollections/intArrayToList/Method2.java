package DSA.dataStructure.arrayToCollections.intArrayToList;

import java.util.List;
import java.util.stream.IntStream;

public class Method2 {
  public static void main(String[] args) {
    int[] numbers = {20, 15, 12, 14, 18, 23, 11, 7, 45, 32, 17};

    List<Integer> numberList = IntStream.of(numbers).boxed().toList();

    System.out.println(numberList);
  }
}
