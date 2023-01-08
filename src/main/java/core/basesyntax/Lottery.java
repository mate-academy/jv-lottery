package core.basesyntax;

public class Lottery {
    final int MAX_SIZE = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(MAX_SIZE);
        ball.setColor();
        return ball;
    }
}
