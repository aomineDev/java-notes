package generics;

class Box<T> {
  private T content;

  public void setContet(T content) {
    this.content = content;
  }

  public T getContent() {
    return content;
  }
}

public class Main {
  public static void main(String[] args) {
    Box<String> stringBox = new Box<>();
    stringBox.setContet("Hello world");
    System.out.println(stringBox.getContent());

    Box<Integer> integerBox = new Box<>();
    integerBox.setContet(123);
    System.out.println(integerBox.getContent());
  }
}
