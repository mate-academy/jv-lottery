package core.basesyntax;

public class Ball {
    private byte number;

    private String color;

    public Ball(String color, byte number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color=" + color
                + '}';
    }
}
