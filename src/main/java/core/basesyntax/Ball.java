package core.basesyntax;

public class Ball {
    private String color;

    private int number;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public Ball() {
    }

    @Override
    public String toString() {
        return "color " + color + "number " + number;
    }
}
