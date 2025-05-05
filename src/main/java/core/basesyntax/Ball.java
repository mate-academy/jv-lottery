package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    // Constructor for a Ball with a color as Colors enum
    public Ball(Colors color, int number) {
        this.color = color.toString();
        this.number = number;
    }

    // Constructor for a Ball with only a number
    public Ball(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='"
                + color + '\''
                + ", number="
                + number
                + '}';
    }
}
