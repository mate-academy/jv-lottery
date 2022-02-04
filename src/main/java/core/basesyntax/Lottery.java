package core.basesyntax;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(getRandomColor());
        ball.setNumber(nextInt(100));
        return ball;
    }
}
