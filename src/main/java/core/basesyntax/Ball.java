package core.basesyntax;

public class Ball {

  private String color;
  private int number;

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color.toLowerCase();
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public Ball(String color, int number){
    this.color = color;
    this.number = number;
  }
  @Override
  public String toString() {
    return "Ball is of color " + color + " and has a number " + number + ".";
  }
}
