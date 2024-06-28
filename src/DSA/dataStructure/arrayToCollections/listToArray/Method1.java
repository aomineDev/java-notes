package DSA.dataStructure.arrayToCollections.listToArray;

import java.util.Arrays;
import java.util.List;

public class Method1 {
  public static void main(String[] args) {
    List<String> languages = Arrays.asList("java", "c++", "c#", "c", "javascript", "python", "php");

    String[] languagesArr = languages.toArray(String[]::new);

    System.out.println(Arrays.toString(languagesArr));
  }
}
