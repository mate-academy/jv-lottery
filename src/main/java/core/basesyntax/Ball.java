package core.basesyntax;

public class Ball {
    private final int number;
    private final Color color;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    public String toString() {
        return "Ball with number " + number + " and color " + color;
    }
}

