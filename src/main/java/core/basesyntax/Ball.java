package core.basesyntax;

public class Ball {
    private final Color COLOR;
    private final int NUMBER;

    Ball(Color color, int number) {
        this.COLOR = color;
        this.NUMBER = number;
    }

    @Override
    public String toString() {
        return "Ball " + this.NUMBER + " with " + this.COLOR.name().toLowerCase() + " color.";
    }
}
