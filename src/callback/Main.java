package callback;

import java.util.function.Consumer;

class Task {
  public void executeTask(Consumer<String> callback) {
    System.out.println("executing task...");

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    callback.accept("Task completed successfully");
  }
}

public class Main {
  public static void main(String[] args) {
    Task task = new Task();

    task.executeTask(result -> System.out.println("Callback: " + result));
  }
}
