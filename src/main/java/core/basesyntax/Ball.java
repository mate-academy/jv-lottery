package core.basesyntax;

public class Ball {
    String color;
    int number;

    @Override
    public String toString() {
        return "Ball color is " + this.color + ", Ball number is " + this.number;
    }

    public Ball (String color, int number) {
       this.color = color;
       this.number = number;
   }
}
