package core.basesyntax;

public class Ball {
    private final Color color;
    private final int number;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color " + this.color + ". Number " + this.number + ".";
    }
}
