package threads.lock;

public class ThreadTesst {
  public static void main(String[] args) {
    long inicio = System.currentTimeMillis();

    Thread t1 = new Thread(() -> {
      try {
        System.out.println("Thread 1: ejecutando proceso...");
        Thread.sleep(3000);
        System.out.println("Thread 1: proceso finalizado.");
      } catch (Exception e) {
        e.printStackTrace();
      }
    });

    Thread t2 = new Thread(() -> {
      try {
        System.out.println("Thread 2: proceso ejecutando...");
        Thread.sleep(2000);
        System.out.println("Thread 2: proceso finalizado.");
      } catch (Exception e) {
        e.printStackTrace();
      }
    });

    t1.start();
    System.out.println("Thread 1 ha iniciado");

    t2.start();
    System.out.println("Thread 2 ha iniciado");

    try {
      t1.join();
      System.out.println("Thread 1 ha terminado");
      t2.join();
      System.out.println("Thread 2 ha terminado");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    long fin = System.currentTimeMillis();

    System.out.println("fin del programa");

    System.out.println("Tiempo total: " + (fin - inicio) + " ms");
  }
}
