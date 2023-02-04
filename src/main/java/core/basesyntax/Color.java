package core.basesyntax;

public enum Color {

  RED("red"), ORANGE("orange"), BLUE("blue"),
  GREEN("green"), YELLOW("yellow"), PURPLE("purple");
  private final String colorName;

  Color(String colorName) {
    this.colorName = colorName;
  }

  public String getColorName() {
    return colorName;
  }
}
