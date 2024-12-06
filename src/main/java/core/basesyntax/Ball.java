package core.basesyntax;

public class Ball {
  private Enum color;
  private int number;

  public Enum getColor() {
    return color;
  }

  public void setColor(Enum color) {
    this.color = color;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return this.color + " " + this.number;
  }
}
