package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    Ball(final String color, final int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' + ", number=" + number;
    }
}
