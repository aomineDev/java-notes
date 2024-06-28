package DSA.dataStructure.arrayToCollections.stringArrayToList;

import java.util.Arrays;
import java.util.List;

public class Method1 {
  public static void main(String[] args) {
    String[] names = {"Omar", "Jose", "Pedro", "Carlos", "Lucas"};
    List<String> namesList = Arrays.asList(names);
    
    System.out.println(namesList);
  }
}
