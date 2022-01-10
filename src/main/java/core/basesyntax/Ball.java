package core.basesyntax;

public class Ball {
    String color;
    int number;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball number: " + number + ", Ball color: " + color;
    }
}
