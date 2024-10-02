package core.basesyntax;

public class Ball {
    private final ColorOfBall color;
    private final int number;

    public Ball (ColorOfBall color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball(color:" + color + ", number:" + number + ")";
    }
}
