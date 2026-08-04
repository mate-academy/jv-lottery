package core.basesyntax;

public class Lottery extends ColorSupplier {

    private static final int MAX_BALL_NUMBER = 100;

    public Ball getRandomBall() {
        int randomInt = getRandom().nextInt(MAX_BALL_NUMBER);
        Ball ball = new Ball();
        ball.setNumber(randomInt);
        ball.setColor(getRandomColor());

        return ball;
    }
}
