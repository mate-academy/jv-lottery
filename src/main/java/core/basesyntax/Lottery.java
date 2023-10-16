package core.basesyntax;

public class Lottery {
    private final RandomSupplier randomSupplier = new RandomSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(randomSupplier.getRandomValue(100));
        return ball;
    }
}
