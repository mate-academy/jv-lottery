package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Ball number is: ").append(number).append("\nBall color is: ").append(color).toString();
    }
}
