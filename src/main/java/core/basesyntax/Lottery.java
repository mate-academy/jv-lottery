package core.basesyntax;

public class Lottery extends Ball {

    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.getRandomNumber();
        ball.getRandomColor();
        return ball;
    }
}
