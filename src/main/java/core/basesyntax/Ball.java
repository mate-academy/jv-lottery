package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Number: " + number + ", Color: " + color;
    }
}
