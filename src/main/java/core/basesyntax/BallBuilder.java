package core.basesyntax;

public class BallBuilder {
    private String color;
    private int number;

    public BallBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public BallBuilder setNumber(int number) {
        this.number = number;
        return this;
    }

    public Ball createBall() {
        return new Ball(color, number);
    }
}