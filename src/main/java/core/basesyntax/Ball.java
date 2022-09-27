package core.basesyntax;

public class Ball {
    BallColors color;
    int number;

    public Ball(int number, BallColors color) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number of ball: " + number +
                ", color: " + color.toString();
    }
}
