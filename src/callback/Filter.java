package callback;

import java.util.ArrayList;
import java.util.function.Predicate;

class Arr<T> {
  private ArrayList<T> list;

  Arr () {
    list = new ArrayList<>();  
  }

  Arr (ArrayList<T> list) {
    list = new ArrayList<>(list);  
  }

  public void add(T item) {
    list.add(item);
  }

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

  public ArrayList<T> toArrayList() {
    return new ArrayList<T>(list);
  }

  @Override
  public String toString() {
    return list.toString();
  }
}

public class Filter {
  public static void main(String[] args) {
    Arr<Integer> numbers = new Arr<>();
    
    numbers.addAll(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18});

    Arr<Integer> numbersFiltered = numbers.filter(e -> e < 10);
   
    System.out.println(numbers);
    System.out.println(numbersFiltered);
  }
}
