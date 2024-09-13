package anonymousClass;

class Anonymous {
  public void printMessage() {
    System.out.println("Hello World!");
  }
}

public class Main {
  public static void main(String[] args) {
    Anonymous a1 = new Anonymous();
    a1.printMessage();

    Anonymous a2 = new Anonymous() {
      private String message = "zip zap";

      @Override
      public void printMessage() {
        System.out.println(message);
        printAnotherMessage();
      }

      public void printAnotherMessage() {
        System.out.println("Another message");
      }
    };

    a2.printMessage();
  }
}
