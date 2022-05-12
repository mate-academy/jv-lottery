package core.basesyntax;

public class Ball {
    private final int number;
    private final String color;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball[" + "number=" + this.number + ", color='" + this.color + '\'' + ']';
    }
}
