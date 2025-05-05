package core.basesyntax;

public class Ball {
    private static final int BALL_NUMBER = 3;
    private int number;
    private String color;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public static int getBallNumber() {
        return BALL_NUMBER;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color='" + color + '\''
                + '}';
    }
}
