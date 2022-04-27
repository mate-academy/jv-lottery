package core.basesyntax;

public class Ball {
    private int number = 0;
    private String color = "";

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{"
            + "number=" + number
            + ", color='" + color + '\''
            + '}';
    }
}
