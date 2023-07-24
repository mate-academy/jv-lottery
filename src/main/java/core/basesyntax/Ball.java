package core.basesyntax;

public class Ball {
    private Enum color;
    private int number;

    @Override
    public String toString() {
        return "color: " + color + "\n" + "number: " + number;
    }

    public Ball(Enum color, int number) {
        this.color = color;
        this.number = number;
    }
}
