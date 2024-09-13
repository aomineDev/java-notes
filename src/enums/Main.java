package enums;

public class Main {
  public static void main(String[] args) {
    System.out.println(Days.values().length);
    System.out.println("Hoy es: " + Days.LUNES + " - indice: " + Days.LUNES.ordinal());

    System.out.println("Estacion: " + Stations.SUMMER);
    System.out.println("Description: " + Stations.SUMMER.getDescription());
  }
}
