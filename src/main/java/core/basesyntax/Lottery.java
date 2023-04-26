package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(ball.getRandomColor());
        ball.setNumber(ball.getRandomNumber());
        return ball;
    }
}
