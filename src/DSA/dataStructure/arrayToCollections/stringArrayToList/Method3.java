package DSA.dataStructure.arrayToCollections.stringArrayToList;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Method3 {
  public static void main(String[] args) {
    String[] names = {"Omar", "Jose", "Pedro", "Carlos", "Lucas"};
    List<String> namesList = new ArrayList<>();

    namesList.addAll(Arrays.asList(names));
    
    System.out.println(namesList);
  }
}
