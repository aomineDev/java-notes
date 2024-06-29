package references;

import java.util.List;

public class App {
  public static void main(String[] args) {
    System.out.println("Print even numbers");
    List<Integer> evenNumberList =  List.of(1, 2, 3, 4, 5, 6)
      .stream()
      .filter(App::isEven)
      .toList();

      evenNumberList.forEach(App::print);
  }

  static Boolean isEven (Integer number) {
    return number % 2 == 0;
  }

  static void print (Integer number) {
    System.out.println(number);
  }
}
