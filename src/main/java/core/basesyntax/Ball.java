package core.basesyntax;

public class Ball {
    private final Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return "color is: " + color + "; number is: " + number + ";";
    }
}
