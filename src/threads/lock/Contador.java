package threads.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Contador {
  private int contador;
  private Lock lock;

  public Contador() {
    contador = 0;
    lock = new ReentrantLock();
  }

  public void incrementar(String threadName) {
    System.out.println(threadName + ": Lock");
    lock.lock();

    try {
      System.out.println(threadName + ": Esperando 3 segundos");
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      return;
    }

    try {
      System.out.println(threadName + ": incrementando contador");
      contador++;
    } finally {
      System.out.println(threadName + ": liberando lock");
      lock.unlock();
    }
  }

  public int getContador() {
    return contador;
  }
}
