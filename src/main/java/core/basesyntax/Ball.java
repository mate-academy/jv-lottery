package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String toString(Ball ball) {
        return "Ball number " + ball.number + " has " + ball.color + " color.";
    }
}
