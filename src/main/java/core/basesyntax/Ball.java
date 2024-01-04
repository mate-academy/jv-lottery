package core.basesyntax;

public class Ball {
    public static final int MAX_NUMBER_BALL = 101;
    private String color;
    private int number;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public Ball() {

    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='"
                + this.color
                + '\''
                + ", number="
                + this.number
                + '}';
    }
}
