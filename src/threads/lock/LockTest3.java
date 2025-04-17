package threads.lock;

public class LockTest3 {
  public static void main(String[] args) {
    long inicio = System.currentTimeMillis();

    Contador contador = new Contador();

    Thread t1 = new Thread(() -> {
      System.out.println("Ejecutando thread 1");
      contador.incrementar("Thread 1");
    });

    Thread t2 = new Thread(() -> {
      System.out.println("Ejecutando thread 2");
      contador.incrementar("Thread 2");
    });

    t1.start();
    t2.start();

    try {

      t1.join();
      System.out.println("Thread 1 ha terminado\n---");
      t2.join();
      System.out.println("Thread 2 ha terminado\n---");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    long fin = System.currentTimeMillis();

    System.out.println("valor final de contador: " + contador.getContador());

    System.out.println("Tiempo transcurrido: " + (fin - inicio) + " ms");
  }
}
