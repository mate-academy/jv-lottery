package core.basesyntax;

public class Lottery {
    public String getRandomBall() {
        Ball ball = new Ball();
        return "the ball is " + ball.toString();
    }
}
