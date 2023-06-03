package core.basesyntax;

public class Lottery extends Ball {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.getRandomNumber();
        ball.getRandomColor();
        return ball;
    }
}