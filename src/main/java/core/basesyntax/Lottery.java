package core.basesyntax;

public class Lottery {
int MAX_NUMBER = 100;
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(MAX_NUMBER);
        ball.setColor();
        return ball;
    }
}
