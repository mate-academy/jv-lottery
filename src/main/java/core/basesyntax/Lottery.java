package core.basesyntax;

public class Lottery {
    private Ball ball;
    private ColorSupplier color;
    private NumberBall numberBall;

    public Lottery(Ball ball, ColorSupplier color, NumberBall numberBall) {
        this.ball = ball;
        this.color = color;
        this.numberBall = numberBall;
    }

    public Ball getRandomBall() {
        ball.setColor(color.getRandomColor());
        ball.setNumber(numberBall.getRandomNumber());
        return ball;
    }
}

