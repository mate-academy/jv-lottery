package core.basesyntax;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(ball.getRandomNumber());
        return ball;
    }
}
