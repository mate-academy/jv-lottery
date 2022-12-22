package core.basesyntax;

public class Ball {
  private String color;
  private int number;

  @Override
  public String toString() {
    return "ball = " + color + " " + number;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}
