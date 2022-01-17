package core.basesyntax;

public class Ball {
    private String color;
    private byte number;

    public Ball(String color, byte number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='"
                + color
                + '\''
                + ", number="
                + number
                + '}';
    }
}
