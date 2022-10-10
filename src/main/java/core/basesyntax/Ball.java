package core.basesyntax;

public class Ball {
    public Ball(differentColor color, int number) {
        this.color = color;
        this.number = number;
    }

    private final differentColor color;
    private final int number;

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
