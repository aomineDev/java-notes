package DSA.dataStructure.arrayToCollections.stringArrayToList;

import java.util.List;
import java.util.ArrayList;

public class Method2 {
  public static void main(String[] args) {
    String[] names = {"Omar", "Jose", "Pedro", "Carlos", "Lucas"};
    List<String> namesList = new ArrayList<>();

    for (String name: names) namesList.add(name);
    
    System.out.println(namesList);
  }
}
