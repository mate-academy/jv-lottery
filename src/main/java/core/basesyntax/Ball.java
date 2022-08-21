package core.basesyntax;

public class Ball {
    private String color;
    private int number;
    public Ball (String color,int number) {
      this.color = color;
      this.number = number;
    }
    public Ball () {

    }
    public String toString() {
return "ball number is: " + number + " ball color is " + color;
    }
}
