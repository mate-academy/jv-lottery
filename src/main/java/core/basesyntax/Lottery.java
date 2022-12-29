package core.basesyntax;

public class Lottery {

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber();
        ball.setColor();
        return ball;
    }
}
