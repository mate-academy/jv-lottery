package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor();
        ball.setNumber();

        return ball;
    }
}


