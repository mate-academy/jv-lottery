package core.basesyntax;

public class Ball {
    private final Colors color;
    private final int number;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return "Number of ball = " + number + " and color is " + color;
    }
}
