package DSA.algorithms.processPlannig;

public class Proceso {
  public String nombre;
  public int tiempoLlegada;
  public int tiempoEjecucion;
  public int tiempoEspera;
  public int tiempoFinalizacion;

  public Proceso(String nombre, int tiempoLlegada, int tiempoEjecucion) {
    this.nombre = nombre;
    this.tiempoLlegada = tiempoLlegada;
    this.tiempoEjecucion = tiempoEjecucion;
  }
}
