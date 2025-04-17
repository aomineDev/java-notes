package threads.lock;

public class LockTest2 {
  public static void main(String[] args) {
    ContadorSeguro contador = new ContadorSeguro();

    Thread t1 = new Thread(() -> {
      System.out.println("Ejecutando thread 1");
      for (int i = 0; i < 10; i++) {
        contador.incrementar("Thread 1");
      }
    });

    Thread t2 = new Thread(() -> {
      System.out.println("Ejecutando thread 2");
      for (int i = 0; i < 10; i++) {
        contador.incrementar("Thread 2");
      }
    });

    t1.start();
    t2.start();

    try {

      t1.join();
      System.out.println("Thread 1 ha terminado");
      t2.join();
      System.out.println("Thread 2 ha terminado");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("valor final de contador: " + contador.getContador());
  }
}
