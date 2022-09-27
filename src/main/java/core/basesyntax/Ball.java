package core.basesyntax;

public class Ball {
    String color;
    int number;

    public Ball(int number, String color) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number of ball: " + number +
                ", color: " + color;
    }
}
