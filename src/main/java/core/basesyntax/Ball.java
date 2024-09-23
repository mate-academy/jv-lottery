package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = String.valueOf(color);
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ball{color=" + color + ", number=" + number + "}";
    }
}
