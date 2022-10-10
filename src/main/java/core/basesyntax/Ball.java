package core.basesyntax;

public class Ball {
    public Ball(DifferentColor color, int number) {
        this.color = color;
        this.number = number;
    }

    private final int number;
    private final DifferentColor color;


    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", number=" + number + '}';
    }
}
