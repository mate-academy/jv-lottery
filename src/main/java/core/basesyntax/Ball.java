package core.basesyntax;

public class Ball {
    private final Color color;
    private final int number;

    Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return "A ball with color: " + color + " and number: " + number;
    }
}
