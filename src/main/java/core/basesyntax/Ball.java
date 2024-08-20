package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball { "
                + " color = "
                + color
                + ", number = "
                + number
                + " }";
    }

    public enum Color {
        RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE, PINK;
    }
}
