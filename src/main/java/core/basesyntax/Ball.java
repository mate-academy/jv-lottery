package core.basesyntax;

public class Ball {
    private int value;
    private String color;

    public Ball() {
    }

    public Ball(int value, String color) {
        this.value = value;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "value=" + value
                + ", color='" + color
                + '\''
                + '}';
    }
}
