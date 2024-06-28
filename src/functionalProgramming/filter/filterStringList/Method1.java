package functionalProgramming.filter.filterStringList;

import java.util.Arrays;
import java.util.List;

public class Method1 {
  public static void main(String[] args) {
    String[] words = {"arbol", "bebe", "carro", "ancla", "auto", "bolsa", "diente", "brazo"};

    List<String> wordsList = Arrays.asList(words);

    List<String> wordsListFilter = wordsList.stream()
      .filter(w -> w.startsWith("b"))
      .toList();

    System.out.println(wordsListFilter);
  } 
}
