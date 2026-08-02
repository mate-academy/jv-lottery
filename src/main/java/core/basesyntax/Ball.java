package core.basesyntax;

public class Ball {
    private final Colors colors;
    private final int number;

    public Ball(Colors colors, int number) {
        this.colors = colors;
        this.number = number;
    }

    @Override
    public String toString() {
        return colors.name() + ", number=" + number;
    }
}
