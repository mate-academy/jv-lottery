package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
