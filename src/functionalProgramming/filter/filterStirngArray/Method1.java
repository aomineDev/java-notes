package functionalProgramming.filter.filterStirngArray;

import java.util.Arrays;

public class Method1 {
  public static void main(String[] args) {
    String[] words = {"arbol", "bebe", "carro", "ancla", "auto", "bolsa", "diente"};

    String[] wordsFilter = Arrays.stream(words)
      .filter(e -> e.startsWith("a"))
      .toArray(String[]::new);

    System.out.println(Arrays.toString(wordsFilter));
  }
}
