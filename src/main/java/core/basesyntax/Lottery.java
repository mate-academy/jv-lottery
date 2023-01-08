package core.basesyntax;

public class Lottery {
    final int maxSize = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(maxSize);
        ball.setColor();
        return ball;
    }
}
