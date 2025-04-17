package threads.lock;

public class ContadorInseguro {
  private int contador;

  public ContadorInseguro() {
    contador = 0;
  }

  public void incrementar(String threadName) {
    contador++;
    System.out.println(threadName + ": incrementando contador");
  }

  public int getContador() {
    return contador;
  }
}
