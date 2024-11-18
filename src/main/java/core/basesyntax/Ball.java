package core.basesyntax;

public class Ball {
    private final Color color;
    private final int number;

    public Ball(String color, int number) {
        this.color = Color.valueOf(color);
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{color=" + color + ", number=" + number + "}";
    }
}
