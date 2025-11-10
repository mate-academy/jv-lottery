package core.basesyntax;

public class Ball {
    private final Colors color;

    private final int number;

    public Ball(int number, Colors color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return color.name() + " ball by number: " + number + ".";
    }
}
