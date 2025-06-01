package DSA.algorithms.processPlannig.sjf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Proceso {
  public int id;
  public int tiempoejecucion;
  public int tiempoespera;
  public int tiempofinal;

  public Proceso(int id, int tiempoejecucion) {
    this.id = id;
    this.tiempoejecucion = tiempoejecucion;
  }
}

public class SJF {

  public static void main(String[] args) {
    List<Proceso> procesos = new ArrayList<>();
    procesos.add(new Proceso(1, 6));
    procesos.add(new Proceso(1, 8));
    procesos.add(new Proceso(2, 7));
    procesos.add(new Proceso(3, 3));
    // ordenar por tiempo de ejecucion
    procesos.sort(Comparator.comparingInt(p -> p.tiempoejecucion));
    int tiempoActual = 0;
    int totalEspera = 0;
    int totalGiro = 0;
    System.out.println("Proceso | Tiempo de Ejecucion | Tiempo Final");
    // recorrer los procesos (giro)
    for (Proceso p : procesos) {
      p.tiempoespera = tiempoActual;
      tiempoActual = tiempoActual + p.tiempoejecucion;
      totalEspera = totalEspera + p.tiempoespera;
      totalGiro = totalGiro + p.tiempofinal;

      System.out.printf("p%d | %2d | %2d | %2d\n", p.id, p.tiempoejecucion, p.tiempoespera, p.tiempofinal);

    }
    // reporte de pie
    int n = procesos.size();
    System.out.printf("\nTiempo promedio de espera: %.2f\n", (float) totalEspera / n);
    System.out.printf("\nTiempo promedio de espera: %.2f\n", (float) totalGiro);
  }

}