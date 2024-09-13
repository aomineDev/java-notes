package enums;

public enum Stations {
  SPRING("Templado"),
  SUMMER("Calurosa"),
  AUTUMN("Fresca"),
  WINTER("Fria");

  private String description;

  Stations(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}