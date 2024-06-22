package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String ballColor, int ballNumber) {
        this.color = ballColor;
        this.number = ballNumber;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color=" + color
                + ", number=" + number + '\''
                + '}';
    }
}
