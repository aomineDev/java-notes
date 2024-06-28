package functionalProgramming.filter.filterStirngArray;

import java.util.Arrays;
import java.util.stream.Stream;

public class Method2 {
  public static void main(String[] args) {
    String[] words = {"arbol", "bebe", "carro", "ancla", "auto", "bolsa", "diente"};

    String[] wordsFilter = Stream.of(words)
      .filter(e -> e.startsWith("a"))
      .toArray(String[]::new);

    System.out.println(Arrays.toString(wordsFilter));
  }
}
