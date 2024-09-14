package callback;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

class Arr<T> {
  private ArrayList<T> list;

  Arr () {
    list = new ArrayList<>();  
  }

  Arr (ArrayList<T> list) {
    list = new ArrayList<>(list);  
  }

  // default methods
  public void add(T item) {
    list.add(item);
  }

  // new methods
  public void addAll(T[] elements) {
    for(T e: elements) {
      list.add(e);
    }
  }

  public Arr<T> filter(Predicate<T> callback) {
    Arr<T> filteredList = new Arr<>();

    for(T n: list) if(callback.test(n)) filteredList.add(n);
    
    return filteredList;
  }

  public Arr<T> map(UnaryOperator<T> callback) {
    Arr<T> newList = new Arr<>();

    for (T e: list) newList.add(callback.apply(e));

    return newList;
  }

  public Arr<T> map(BiFunction<T, Integer, T> callback) {
    Arr<T> newList = new Arr<>();

    for(int i = 0; i < list.size(); i ++) {
      newList.add(callback.apply(list.get(i), i));
    }

    return newList;
  }

  public void forEach(Consumer<T> callback) {
    for (T e: list) {
      callback.accept(e);
    }
  }

  public void forEach(BiConsumer<T, Integer> callback) {
    for (int i = 0; i < list.size(); i++) {
      callback.accept(list.get(i), i);
    }
  }

  // casting methods
  public ArrayList<T> toArrayList() {
    return new ArrayList<T>(list);
  }

  @Override
  public String toString() {
    return list.toString();
  }
}

public class ArrayMethods {
  public static void main(String[] args) {
    Arr<Integer> numbers = new Arr<>();
    
    numbers.addAll(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18});

    Arr<Integer> numbersFiltered = numbers.filter(e -> e < 10);

    Arr<Integer> numbersMapped = numbersFiltered.map((e, i) -> {
      System.out.println("number : " + e + "| index: " + i);
      return e + i;
    });

    System.out.println(numbersMapped);

    numbersMapped = numbersFiltered.map(e -> {
      System.out.println("number : " + e);
      return e + 1;
    });

    System.out.println(numbersMapped);
  }
}
