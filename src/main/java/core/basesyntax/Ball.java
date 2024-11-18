package core.basesyntax;

public class Ball {
    String color;
    int number;

public Ball(String color, int number) {
    this.color = color;
    this.number = number;
}
    @Override
    public String toString() {
        System.out.println("Color :" + color + ", number :" + number);
    }
}
