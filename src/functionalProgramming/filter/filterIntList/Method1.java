package functionalProgramming.filter.filterIntList;

import java.util.List;
import java.util.Arrays;

public class Method1 {
  public static void main(String[] args) {
    List<Integer> numberList = Arrays.asList(20, 15, 12, 14, 18, 23, 11, 7, 45, 32, 17);

    List<Integer> numberListFilter = numberList.stream()
      .filter(v -> v < 18)
      .toList();

    System.out.println(numberListFilter);
  }
}
