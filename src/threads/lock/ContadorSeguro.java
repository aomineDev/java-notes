package threads.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ContadorSeguro {
  private int contador;
  private Lock lock;

  public ContadorSeguro() {
    lock = new ReentrantLock();
  }

  public void incrementar(String threadName) {
    lock.lock();

    try {
      contador++;

      System.out.println(threadName + ": incrementando contador");

    } finally {
      lock.unlock();

    }
  }

  public int getContador() {
    lock.lock();

    try {
      return contador;
    } finally {
      lock.unlock();
    }
  }
}
