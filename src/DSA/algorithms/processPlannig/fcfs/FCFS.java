package DSA.algorithms.processPlannig.fcfs;

import java.util.Arrays;

import DSA.algorithms.processPlannig.Proceso;

public class FCFS {
  public static void fcfs(Proceso[] procesos) {
    Arrays.sort(procesos, (p1, p2) -> p1.tiempoLlegada - p2.tiempoLlegada);

    int tiempoActual = 0;

    for (Proceso p : procesos) {
      if (p.tiempoLlegada > tiempoActual) {
        tiempoActual = p.tiempoLlegada;
      }

      p.tiempoEspera = tiempoActual - p.tiempoLlegada;
      tiempoActual += p.tiempoEjecucion;
      p.tiempoFinalizacion = tiempoActual;
    }

    System.out.println(String.format("%-10s | %-10s | %-10s | %-10s | %-10s", "Proceso", "Llegada", "Ejecucion",
        "Espera", "Finalizacion"));
    for (Proceso p : procesos) {
      System.out.println(String.format("%-10s | %-10s | %-10s | %-10s | %-10s", p.nombre, p.tiempoLlegada,
          p.tiempoEjecucion, p.tiempoEspera, p.tiempoFinalizacion));
    }
  }

  public static void main(String[] args) {
    Proceso[] procesos = {
        new Proceso("P1", 0, 5),
        new Proceso("P2", 6, 3),
        new Proceso("P3", 7, 1)
    };

    fcfs(procesos);
  }
}
